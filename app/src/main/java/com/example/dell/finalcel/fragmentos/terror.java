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
 * {@link terror.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link terror#newInstance} factory method to
 * create an instance of this fragment.
 */
public class terror extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Context globalContext = null;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public terror() {
        // Required empty public constructor
    }
    ListView lvtTerror;
    ArrayList<Pelicula> lista_t;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment terror.
     */
    // TODO: Rename and change types and number of parameters
    public static terror newInstance(String param1, String param2) {
        terror fragment = new terror();
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
        View vista = inflater.inflate(R.layout.fragment_terror, container, false);
        lvtTerror= vista.findViewById(R.id.lvTerror);
        lista_t= new ArrayList<>();

        lista_t.add(new Pelicula(1,"It ",2017,135,"Terror",1.25," Cuando empiezan a desparecer niños en el pueblo de Derry, Maine, un grupo de niños lidia con sus mayores miedos al enfrentarse a un malvado payaso llamado Pennywise, cuya historia de asesinatos y violencia data de siglos.",R.drawable.it));
        lista_t.add(new Pelicula(2," Carrie ",2013,100,"Terror",1.25," Carrie White, una chica tímida, marginada por sus compañeros y protegida por su madre profundamente religiosa, desata el terror telequinético en su pequeño pueblo, después de haber sido llevada al límite en su baile de graduación.",R.drawable.carrie));
        lista_t.add(new Pelicula(3," Annabelle",2014,98,"Terror",1.25," John Form encuentra el regalo perfecto para su mujer embarazada, Mia: una preciosa e inusual muñeca vintage que lleva un vestido de novia blanco inmaculado. Sin embargo, la alegría de Mia al recibir a Annabelle no dura mucho. Durante una espantosa noche la pareja ve como miembros de una secta satánica invaden su hogar y los atacan brutalmente. No sólo dejan sangre derramada y terror tras su visitalos miembros de la secta conjuran a un ente de tal maldad que " +
                "nada de lo que han hecho se compara al siniestro camino a la maldición que ahora es... Annabelle.",R.drawable.anabelle));
        lista_t.add(new Pelicula(5,"Feliz día de tu muerte",2017,96,"Terror",1.25," La película cuenta la historia de la joven Tree en el peor día de su vida. Una mañana de resaca despierta en la residencia de un compañero de Universidad, corriendo se viste y se dirige a su dormitorio para hablar con sus compañeras y comenzar a celebrar su cumpleaños. En la fiesta de esa misma noche es atacada y aparentemente asesinada, pero ese momento es interrumpido por el comienzo de un nuevo día.",R.drawable.feliz));
        lista_t.add(new Pelicula(6,"La cueva",2014,80,"Terror",1.25," Tres chicos y dos chicas viajan en plan mochilero a una isla paradisíaca. Deciden explorar una cueva profunda y laberíntica, pero se pierden. Si quieren sobrevivir dentro de la cueva, deberán hacerlo en condiciones inhumanas: sin agua y sin alimentos, no parece que haya ninguna posibilidad de conseguirlo. ",R.drawable.cueva));
        lista_t.add(new Pelicula(7,"The Crucifixion",2017,90,"Terror",1.25," Basada en hechos reales, 'The Crucifixion' cuenta la historia de un sacerdote que es encarcelado en Rumanía por el asesinato de una monja a la que realizaba un exorcismo. La periodista Nicole Rawlins investiga si el asesinato fue a una persona mentalmente enferma o, por el contrario, las acusaciones son falsas y simplemente perdió la batalla contra una presencia demoníaca. Una presencia que ahora podría estar experimentando ella misma...",R.drawable.crucifix));
        lista_t.add(new Pelicula(8,"Exorcismo en Georgia",2013,100,"Terror",1.25," Poco después de trasladarse a su nuevo hogar en Georgia una pareja se entera de que su hija tiene misteriosas visiones de personas que nadie más que ella parece ver. Finalmente ellos también serán testigos de extraños fenómenos que tienen lugar alrededor de la casa y que irán aportando pistas de lo que podría ser un escalofriante misterio que se ha mantenido en secreto durante generaciones...",R.drawable.exorcismo));
        lista_t.add(new Pelicula(9,"La primera purga: La noche de las bestias",2018,96,"Terror",1.25," Detrás de cada tradición se encuentra una revolución. El próximo Día de la Independencia es testigo de la llegada de las 12 horas de anarquía anual de nuestro país. Bienvenido al movimiento que comenzó como un simple experimento: La primera purga. Para impulsar la tasa de criminalidad por debajo del uno por ciento durante el resto del año, los Nuevos Padres Fundadores de América ponen a prueba una teoría sociológica que permite la agresión por una noche en una comunidad aislada. Pero cuando la violencia de los opresores se encuentra con la furia de los marginados, el contagio explotará desde las fronteras de la ciudad y se extenderá por toda la nación.",R.drawable.purga));
        lista_t.add(new Pelicula(10,"Amityville: El despertar ",2017,85,"Terror",1.25," Belle y su familia se mudan a una nueva casa, para ahorrar dinero y así ayudar a pagar la asistencia sanitaria de su hermano gemelo James, que se encuentra en coma. Pero cuando empiezan a ocurrir fenómenos extraños, incluyendo la milagrosa recuperación de James, Belle comienza a sospechar que su madre no le ha contado toda la verdad y pronto descubre que acaban de mudarse a la terrorífica casa de Amityville.",R.drawable.am));


        Adaptador miAdap = new Adaptador(globalContext,lista_t);
        lvtTerror.setAdapter(miAdap);

        lvtTerror.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
