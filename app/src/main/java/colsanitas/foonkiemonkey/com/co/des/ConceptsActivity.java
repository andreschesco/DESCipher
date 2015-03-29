package colsanitas.foonkiemonkey.com.co.des;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import colsanitas.foonkiemonkey.com.co.des.util.ListConceptsInput;
import colsanitas.foonkiemonkey.com.co.des.util.ListaAdaptador;


public class ConceptsActivity extends ActionBarActivity {

    private ListView list;
    private BaseAdapter adapterList;
    static ArrayList<ListConceptsInput> data;
    private ListConceptsInput itemConcept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concepts);

        list = (ListView) findViewById(R.id.list_concepts);
        data = new ArrayList<ListConceptsInput>();

        String description= getResources().getString(R.string.description);
        itemConcept = new ListConceptsInput("Criptografía", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_cifrar);
        itemConcept = new ListConceptsInput("Cifrar", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_descifrar);
        itemConcept = new ListConceptsInput("Descifrar", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_llave);
        itemConcept = new ListConceptsInput("Llave o clave", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_textcip);
        itemConcept = new ListConceptsInput("Texto cifrado", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_textplain);
        itemConcept = new ListConceptsInput("Texto plano o mensaje", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_block_Ciphers);
        itemConcept = new ListConceptsInput("Cifrado por bloques", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_Substitution);
        itemConcept = new ListConceptsInput("Cifrado de sustitución", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_Transposition);
        itemConcept = new ListConceptsInput("Cifrado de transposición", description,false);
        data.add(itemConcept);

        description= getResources().getString(R.string.description_Product);
        itemConcept = new ListConceptsInput("Cifrado de producto", description,false);
        data.add(itemConcept);




        adapterList = (new ListaAdaptador(this, R.layout.list_concepts, data) {
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView textTitle = (TextView) view.findViewById(R.id.text_title);
                    if (textTitle != null) {
                        textTitle.setText(((ListConceptsInput) entrada).getTitle());
                    }


                    TextView textDescription = (TextView) view.findViewById(R.id.text_description);
                    if (textDescription != null) {
                        textDescription.setText(((ListConceptsInput) entrada).getDescription());
                        if(((ListConceptsInput) entrada).getVisibleDescription()){
                            textDescription.setVisibility(View.VISIBLE);
                            textDescription.setMaxLines(100);
                        }else{
                            textDescription.setVisibility(View.INVISIBLE);
                            textDescription.setMaxLines(1);
                        }
                    }

                }
            }
        });

        list.setAdapter(adapterList);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long l) {

                ListConceptsInput item = (ListConceptsInput) pariente.getItemAtPosition(posicion);
                if(item.getVisibleDescription()) {
                    item.setVisibleDescription(false);
                }else{
                    item.setVisibleDescription(true);
                }

                adapterList.notifyDataSetChanged();
            }
        });

    }

    public void nextClick(View v) {
        Intent intent = new Intent(this, CipherActivity.class);
        startActivity(intent);
    }

}



