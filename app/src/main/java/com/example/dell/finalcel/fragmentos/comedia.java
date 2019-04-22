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
 * {@link comedia.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link comedia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class comedia extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Context globalContext = null;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public comedia() {
        // Required empty public constructor
    }
    ListView lvtcomedia;
    ArrayList<Pelicula> lista_c;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment comedia.
     */
    // TODO: Rename and change types and number of parameters
    public static comedia newInstance(String param1, String param2) {
        comedia fragment = new comedia();
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
        View vista = inflater.inflate(R.layout.fragment_comedia, container, false);
        lvtcomedia = vista.findViewById(R.id.lvComedia);
        lista_c = new ArrayList<>();

        lista_c.add(new Pelicula(1," Qué esperar cuando estás esperando",2012,110,"Comedia",1.25," Los desafíos de la paternidad inminente transforman las vidas de cinco parejas. Dos celebridades no están preparadas para las demandas sorprendentes del embarazo; hormonas causan estragos en autora loca por los bebés, mientras su marido intenta no ser superado por su padre, quien espera gemelos con su esposa menor; esposo de fotógrafa no está seguro de los planes de adopción de su esposa; una aventura de una noche provoca embarazo entre dos rivales dueños de camiones de comida. ",R.drawable.queesperar));
        lista_c.add(new Pelicula(2," Cazafantasmas",2016,116,"Comedia",1.25," Treinta años después de que la película original arrasara en todo el mundo, vuelve Cazafantasmas, totalmente renovada para las nuevas generaciones. El director Paul Feig combina todos los elementos de la lucha paranormal que tanto gustaron en la franquicia original con un reparto de nuevos personajes interpretados por las actrices más divertidas del momento. ¡Prepárate para verlas salvar el mundo!",R.drawable.cazafantasmas));
        lista_c.add(new Pelicula(3,"Somos los Miller",2013,110,"Comedia",1.25,"El distribuidor de marihuana David aprende por las malas que ninguna buena acción queda sin castigo; él intenta ayudar a algunos jóvenes y es sorprendido por unos criminales, perdiendo su dinero y producto. David está endeudado con su proveedor y para solucionar el problema debe ir a México para recoger un cargamento del jefe. Para lograr la misión, David idea un plan infalible: reúne a una familia falsa y la sube a una casa rodante para dirigirse al sur durante un fin de semana salvaje. ",R.drawable.miller));
        lista_c.add(new Pelicula(4,"Busco novio para mi mujer",2016,110,"Comedia",1.25," Narra la historia de Paco, un hombre hastiado del mal genio y el despotismo de su esposa Danna, por lo que busca deshacerse de ella a toda costa contratando a un galán a sueldo con la intención de que seduzca a su mujer y así pueda pedirle el divorcio.",R.drawable.busco));
        lista_c.add(new Pelicula(5," Campeones",2018,124,"Comedia",1.25," Marco es el segundo entrenador de un equipo de baloncesto de la primera división española. Tiene problemas en el trabajo, con su pareja y con casi todo lo que le rodea. Es, más que nada, una cuestión de actitud frente a la vida. Un día, en pleno partido de Liga, esas frustraciones desembocan en una tremenda bronca con el primer entrenador, que deriva en una borrachera y ésta en un accidente de tráfico que le sienta en el banquillo. La sentencia le llevará a entrenar a un equipo de baloncesto muy especial, formado por personas con discapacidad intelectual, a la vez que pierde su trabajo y se rompe su relación de pareja. De forma sorpresiva para el propio Marco, él será quien realmente aprenda de su aventura junto a un equipo donde imperan las ganas de vivir y el dar importancia a las cosas que realmente la tienen",R.drawable.campeones));
        lista_c.add(new Pelicula(6,"Ted",2012,106,"Comedia",1.25," Cuenta la historia de John Bennett, un hombre hecho y derecho que, de niño, deseó con todo su ser que su adorado osito de peluche cobrara vida. Pero han transcurrido casi 30 años y el cuento de hadas ya no da más de sí. Ted se resiste a abandonar a John y saca de quicio a Lori Collins, la novia de John, que empieza a perder la paciencia. Para colmo, el hecho de que a John no parezca preocuparle su futuro profesional y se pase la vida fumando porros con Ted tampoco sirve para calmar a Lori. Mientras tanto, John intenta encontrar la mejor manera de hacer frente a eso que llaman edad adulta y necesitará la ayuda de su juguete de infancia para dar el salto de hombre-niño a hombre.",R.drawable.ted));
        lista_c.add(new Pelicula(7,"No se aceptan devoluciones",2013,115,"Comedia",1.25,"Valentín es el soltero más mujeriego de Acapulco, hasta que un día, una mujer de su pasado deja un bebé en su puerta y desaparece. Valentín decide ir a Los Ángeles en su búsqueda, pero en vez de encontrar a la madre, encuentra un hogar para él y su hija Maggie. Siendo un papá sin experiencia, educa a Maggie y a la vez se establece como uno de los mejores especialistas de Hollywood, con su hija como su mayor admiradora. Mientras ella crece, Valentín también se ve obligado a madurar, convirtiéndose en un verdadero hombre. Pero cuando la niña cumple 7 años y aparece la madre biológica de Maggie, Valentín se da cuenta de que está a punto de perder a su única familia y a su mejor amiga, su hija.",R.drawable.devoluciones));
        lista_c.add(new Pelicula(8,"Infiltrados en la universidad",2014,112,"Comedia",1.25,"Después de superar el instituto, se van a producir grandes cambios en la vida de los oficiales Schmidt y Jenko cuando su nuevo destino les obliga a infiltrarse en una universidad local. Pero cuando Jenko conoce a su alma gemela en el equipo deportivo y Schmidt se adentra en el grupo de teatro de arte bohemio de la universidad, comienzan a plantearse su relación. Por tanto, en esta ocasión no sólo tendrán que resolver el caso, sino que también tendrán que descubrir si pueden tener una amistad madura. Si estos dos adolescentes creciditos pueden madurar y convertirse en hombres de verdad, la universidad probablemente se convierta en lo mejor que les haya podido pasar.",R.drawable.infiltrados));
        lista_c.add(new Pelicula(9,"Hombre al agua",2018,112,"Comedia",1.25, "Leonardo, un millonario mexicano egoísta y caprichoso, despide a Kate, una madre soltera sin recursos. Poco después, el hombre pierde la memoria al caer por la borda de su yate y ella se venga haciéndole creer que es su esposo.",R.drawable.hombreal));
        lista_c.add(new Pelicula(10," Baywatch: Los vigilantes de la playa",2017,119,"Comedia",1.25,"Los vigilantes de la playa' narra la historia del esforzado socorrista Mitch Buchannon (Johnson) y su choque de personalidades con un bravucón socorrista novato. Juntos, descubren una trama delictiva local que amenaza el futuro de la Bahía. ",R.drawable.watch));

        Adaptador miAdap = new Adaptador(globalContext,lista_c);
        lvtcomedia.setAdapter(miAdap);
        lvtcomedia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
