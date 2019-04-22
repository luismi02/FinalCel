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
 * {@link infantil.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link infantil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class infantil extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private Context globalContext = null;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public infantil() {
        // Required empty public constructor
    }

    ListView lvtinfantil;
    ArrayList<Pelicula> lista_i;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment infantil.
     */
    // TODO: Rename and change types and number of parameters
    public static infantil newInstance(String param1, String param2) {
        infantil fragment = new infantil();
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
        View vista = inflater.inflate(R.layout.fragment_infantil, container, false);
        lvtinfantil= vista.findViewById(R.id.lvInfantil);
        lista_i= new ArrayList<>();

        lista_i.add(new Pelicula(1,"Paddington",2015,95,"Infantil",1.25,"Un joven oso, de nombre impronunciable, ha crecido en las profundidades de la selva peruana junto a sus tíos, quienes, debido a un encuentro casual con un explorador inglés, han inculcado a su sobrino el sueño de vivir una vida emocionante en Londres. ",R.drawable.padding));
        lista_i.add(new Pelicula(2,"El tour de los Muppets",2014,112,"Infantil",1.25," La pandilla de los Muppets se va de gira por todo el mundo, llenando las mejores salas de las capitales europeas como Berlín, Madrid o Londres. Pero el caos no los abandona ni siquiera en el extranjero, pues se ven involuntariamente atrapados en una intriga internacional que encabezan Constantine, el mayor delincuente del mundo y la viva imagen de la Rana René. ",R.drawable.mup));
        lista_i.add(new Pelicula(3,"Pinocho y su amiga Coco",2015,103,"Infantil",1.25," Cuando el viejo fabricante de juguetes Gepeto hace un muñeco con un trozo de madera, éste cobra vida sorprendentemente. Le pone el nombre de Pinocho y comienza a educarlo de la mejor manera. Pero el niño de madera es caprichoso y está lleno de descabelladas ideas, y sus travesuras causan serios problemas en el pueblo.",R.drawable.pinocho));
        lista_i.add(new Pelicula(4,"Oz. Un mundo de fantasía",2013,130,"Infantil",1.25," Tres brujas no están convencidas de que el sombrío mago de un circo de Kansas es el gran mago que han estado esperando los habitantes de Oz.",R.drawable.oz));
        lista_i.add(new Pelicula(5,"WALL-E",2008,103,"Infantil",1.25," Tras cientos de solitarios años haciendo aquello para lo que fue construido limpiar el planeta WALL-E descubre una nueva misión en su vida cuando se encuentra con un lustroso robot explorador llamado EVE. Ambos viajan a través de la galaxia y desencadenan una de las más excitantes e imaginativas comedias de aventuras que hayan sido llevadas al cine.",R.drawable.walle));
        lista_i.add(new Pelicula(6,"Home: Hogar dulce hogar",2015,94,"Infantil",1.25, "Después de que una raza alienígena llamada Boov se apodera de la Tierra, una inventiva chica humana se convierte en la aliada de un Boov desterrado. ",R.drawable.home));
        lista_i.add(new Pelicula(7,"Mi amigo el gigante",2016,115,"Infantil",1.25," Cuenta la increíble historia de una niña, la Reina de Inglaterra y un gigante muy bueno destinado a salvar el mundo de los humanos de los gigantes malvados.",R.drawable.gigante));
        lista_i.add(new Pelicula(8,"Hop",2011,90,"Infantil",1.25," Mezcla de animación digital de última generación con acción real,Hop cuenta la historia de Fred (James Marsden), un joven en paro que hiere accidentalmente al Conejito de Pascua y no le queda más remedio que acogerle en su casa mientras se recupera, lo que dará lugar a surrealistas y divertidas situaciones.",R.drawable.hop));
        lista_i.add(new Pelicula(9,"Arthur y la guerra de los mundos",2011,109,"Infantil",1.25," El pequeño Arthur será el encargado de frustrar los planes de Malthazard de dominar el universo, reclutando un ejército de gigantes secuaces. ",R.drawable.arthut));

        lista_i.add(new Pelicula(10,"Coco",2017,106,"Infantil",1.25,"Miguel es un niño que sueña con ser músico, pero su familia se lo prohíbe porque su tatarabuelo, músico, los abandonó, y quieren obligar a Miguel a ser zapatero, como todos los miembros de la familia. Por accidente, Miguel entra en la Tierra de los Muertos, de donde sólo podrá salir si un familiar difunto le concede su bendición, pero su tatarabuela se niega a dejarlo volver con los vivos si no promete que no será músico ",R.drawable.coco));


        Adaptador miAdap = new Adaptador(globalContext,lista_i);
        lvtinfantil.setAdapter(miAdap);

        lvtinfantil.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
