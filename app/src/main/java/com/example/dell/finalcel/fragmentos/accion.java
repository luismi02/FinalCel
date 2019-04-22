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
 * {@link accion.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link accion#newInstance} factory method to
 * create an instance of this fragment.
 */
public class accion extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Context globalContext = null;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public accion() {
        // Required empty public constructor
    }

    ListView lvtaccion;
    ArrayList<Pelicula> lista_a;


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment accion.
     */
    // TODO: Rename and change types and number of parameters
    public static accion newInstance(String param1, String param2) {
        accion fragment = new accion();
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
        View vista = inflater.inflate(R.layout.fragment_accion, container, false);
        lvtaccion= vista.findViewById(R.id.lvAccion);
        lista_a = new ArrayList<>();
        lista_a.add(new Pelicula(1,"Viudas",2018,120,"Accion",1.25,"\t\n" +
                "En Chicago en un tiempo de disturbios, cuatro mujeres con nada en común excepto la deuda de las actividades " +
                "criminales de sus esposos fallecidos, deciden forjar un futuro con sus propias condiciones",R.drawable.viudas));
        lista_a.add(new Pelicula(1,"El caballero oscuro: La leyenda renace",2012,160,"Accion",1.25,"Ocho años después de asumir la culpa por la muerte de Harvey Dent y desaparecer en la noche, Batman debe salir del exilio autoimpuesto por una ladrona astuta y un terrorista despiadado llamado Bane.",R.drawable.batman));
        lista_a.add(new Pelicula(2,"Transformers: La era de la extinción",2014,165,"Accion",1.25," Mientras la humanidad recoge las piezas después de una batalla épica, un grupo oscuro emerge para ganar control de la historia. Mientras tanto, una poderosa y nueva amenaza pone su mirada en la Tierra.",R.drawable.transformers));
        lista_a.add(new Pelicula(3,"300: El origen de un imperio",2014,102,"Accion",1.25,"En el año 480 antes de Cristo, existe un estado de guerra entre Persia, dirigida por el rey Jerjes, y Grecia. En la batalla de la Termópilas, Leonidas, rey de la ciudad griega de Esparta, encabeza a sus 300 bravos soldados en contra del numeroso ejército persa. A pesar de que la muerte aguarda a los espartanos, su sacrificio inspira a toda Grecia para unirla en contra de su enemigo común.",R.drawable.tresc));
        lista_a.add(new Pelicula(4,"Batman v Superman: El amanecer de la justicia",2016,151,"Accion",1.25," Batman se enfrenta a Superman, temeroso de que su afán de poder termine nublando su lucha contra la injusticia y lo convierta en un villano. Mientras los héroes pelean, una amenaza terrible se cierne sobre la humanidad.",R.drawable.batmanvssuperman));
        lista_a.add(new Pelicula(5,"Mad Max: Furia en la carretera",2015,120,"Accion",1.25," Perseguido por su turbulento pasado, Mad Max cree que la mejor forma de sobrevivir es ir solo por el mundo. Sin embargo, se ve arrastrado a formar parte de un grupo que huye a través del desierto en un War Rig conducido por una Emperatriz de élite: Furiosa. Escapan de una Ciudadela tiranizada por Immortan Joe, a quien han arrebatado algo irreemplazable. Enfurecido, el Señor de la Guerra moviliza a todas sus bandas y persigue implacablemente a los rebeldes en la Guerra de la Carretera de altas revoluciones.",R.drawable.madmax));
        lista_a.add(new Pelicula(6,"Los juegos del hambre: En llamas",2013,146,"Accion",1.25," Tras salir victoriosos en los juegos del hambre, Katniss Everdeen y Peeta Mellark emprenden el tour de la victoria. Katniss cree que se está gestando una rebelión, pero un cruel cambio en las reglas del próximo torneo podría cambiar Panem.",R.drawable.juegos));
        lista_a.add(new Pelicula(7,"Wonder Woman",2017,141,"Accion",1.25," Antes de ser Wonder Woman la protagonista se llamaba Diana, princesa del las amazonas entrenada para ser una guerrera invencible. Criada en un paraíso protegido de la isla, cuando un piloto americano se estrella en sus costas le hará saber de la terrible amenaza que afronta el mundo exterior. Diana saldrá entonces de su hogar, convencida de que puede detener la amenaza. En la guerra de todas las guerras, Diana descubrirá todos sus poderes... y su verdadero destino.",R.drawable.mujermaravilla));
        lista_a.add(new Pelicula(9,"xXx: Reactivated",2017,107,"Accion",1.25,"Xander Cage regresa a la acción cuando le encargan recuperar la Caja de Pandora, un aparato que controla los satélites militares de todo el mundo. Durante la misión, Xander se da cuenta de que se está desarrollando una conspiración en la que están implicadas personas extremadamente importantes.",R.drawable.xxx));
        lista_a.add(new Pelicula(10,"Proyecto Rampage",2018,107,"Accion",1.25," Cuando tres animales diferentes quedan infectados con un peligroso patógeno, el primatólogo Davis y la geneticista Kate se unen para detenerlos antes de que destruyan Chicago." ,R.drawable.rampage));



        Adaptador miAdap = new Adaptador(globalContext,lista_a);
        lvtaccion.setAdapter(miAdap);

        lvtaccion.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
