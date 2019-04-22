package com.example.dell.finalcel.fragmentos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dell.finalcel.Adaptador;
import com.example.dell.finalcel.Detalle;
import com.example.dell.finalcel.Pelicula;
import com.example.dell.finalcel.R;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link drama.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link drama#newInstance} factory method to
 * create an instance of this fragment.
 */
public class drama extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Context globalContext = null;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public drama() {

    }
    ListView lvtDrama;
    ArrayList<Pelicula> lista_d;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment drama.
     */
    // TODO: Rename and change types and number of parameters
    public static drama newInstance(String param1, String param2) {
        drama fragment = new drama();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        globalContext = this.getActivity();
        View vista = inflater.inflate(R.layout.fragment_drama, container, false);
        lvtDrama= vista.findViewById(R.id.lvDrama);
        lista_d= new ArrayList<>();

        lista_d.add(new Pelicula(1,"Lo imposible",2012,112,"Drama",1.25," María, Henry y sus tres hijos pequeños vuelan desde Japón a Tailandia para pasar las vacaciones de Navidad en la playa. La mañana después de Navidad, mientras se bañan en la piscina, un tsunami colosal destroza el hotel y gran parte de la costa del sudeste asiático. La familia tendrá que luchar para sobrevivir y reencontrarse..",R.drawable.imposible));
        lista_d.add(new Pelicula(2," Wall Street: El dinero nunca duerme",2010,136,"Drama",1.25," De regreso en acción luego de pasar mucho tiempo en la cárcel, Gordon Gekko se encuentra libre y analizando el mundo que alguna vez dirigió. Gekko aparentemente desea arreglar su relación con su hija e inicia una alianza con su prometido, Jacob. A pesar de que Jacob ve a Gekko como una figura paterna, él descubre que Gekko continúa siendo un experto manipulador que no se detendrá ante nada para lograr sus metas. ",R.drawable.wallstreet));
        lista_d.add(new Pelicula(3,"12 años de esclavitud",2013,133,"Drama",1.25," En los años previos a la Guerra Civil de Estados Unidos, Solomon Northup, un hombre negro libre que vive en Nueva York, es secuestrado y vendido como esclavo. Solomon deberá luchar no sólo por continuar vivo sino también por preservar su dignidad frente a la crueldad de su amo. Su esperanza, alimentada por inesperados gestos de amabilidad y ayuda, no le abandonará a lo largo de su odisea de doce años. La oportunidad de Solomon de conocer a un abolicionista canadiense cambiará su vida para siempre.",R.drawable.anosexclavitud));
        lista_d.add(new Pelicula(5,"El renacido",2015,156,"Drama",1.25,"El trampero Hugh Glass intenta vengarse de sus compañeros, quienes lo abandonaron herido en el bosque después de que lo atacó un oso, pensando que moriría, víctima de las lesiones y de la crudeza del entorno y del invierno. ",R.drawable.renacido));
        lista_d.add(new Pelicula(6,"La habitación",2015,118,"Drama",1.25,"Cuenta la extraordinaria historia de Jack, un niño de cinco años al que cuida su devota y cariñosa. Como cualquier madre, Ma se dedica en cuerpo y alma a la felicidad y protección de Jack, arropándole con su amor, jugando con él y contándole historias. Sin embargo, su vida no tiene nada de normal; están atrapados, encerrados en un espacio de 3,5 x 3,5 metros, sin luz natural, al que Ma ha bautizado con el eufemismo de . Ma ha creado todo un universo para Jack en los confines de Cuarto y nada puede impedirle que Jack tenga una vida plena y satisfactoria a pesar del lugar donde crece. Pero a medida que la curiosidad del niño aumenta y la resistencia de Ma llega al límite, planea una arriesgada huida que les llevará ante algo aún más aterrador: el mundo real.", R.drawable.habitacion));
        lista_d.add(new Pelicula(7,"Siete almas",2018,118,"Drama",1.25," Ben Thomas es un agente del IRS que guarda un fatídico secreto, y que se embarca en un viaje extraordinario de redención en el que cambiará para siempre las vidas de siete desconocidos.Todo comienza con una lista de siete nombres: Holly Apelgren, Connie Tepos, George Ristuccia, Sarah Jenson, Nicholas Adams, Ezra Turner y Emily Posa. Lo único que todos tienen en común es que cada uno de ellos han llegado a un punto en sus vidas en que necesitan ayuda desesperadamente, financiera, espiritual o médica y que sin saberlo, han sido elegidos cuidadosamente por Ben Thomas para formar parte de su plan de redención.Una vez que el plan está en marcha, nada puede alterarlo. O eso es lo que él piensa. Pero lo que nunca esperó era enamorarse de uno de esos extraños, y que sea ella quien comience a cambiarlo a él.",R.drawable.siete));
        lista_d.add(new Pelicula(8,"La cabaña",2017,132,"Drama",1.25," Después de sufrir una tragedia familiar, Mack Phillips cae en una profunda depresión que le lleva a cuestionar todas sus creencias. Sumido en una crisis de fe, recibe una enigmática carta donde un misterioso personaje le cita en una cabaña abandonada en lo más profundo de los bosques de Oregón. A pesar de sus dudas, Mack viaja a la cabaña, donde se encontrará con alguien inesperado. Este encuentro conducirá a Mack a enfrentarse a importantes verdades, que no solo transformarán su comprensión de la tragedia, sino que harán que su vida cambie para siempre.",R.drawable.cabana));
        lista_d.add(new Pelicula(9,"En el corazón del mar",2015,121,"Drama",1.25,"Los tripulantes del ballenero del siglo XIX, Nantucket, enfrentan una batalla terrible por sobrevivir después del ataque de un cachalote gigante en el Pacífico, quedando tres meses a la deriva.",R.drawable.corazonmar));
        lista_d.add(new Pelicula(10,"The Imitation Game",2014,114,"Drama",1.25," Durante la Segunda Guerra Mundial, el genio inglés Alan Turing intenta descifrar el código alemán enigma con la ayuda de otros matemáticos. ",R.drawable.codigo));


                Adaptador miAdap = new Adaptador(globalContext,lista_d);
        lvtDrama.setAdapter(miAdap);

        lvtDrama.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pelicula p = (Pelicula) parent.getItemAtPosition(position);
                Intent i = new Intent(globalContext,Detalle.class);
                i.putExtra("objeto",(Serializable)p);
                startActivity(i);

            }
        });
        return vista;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
