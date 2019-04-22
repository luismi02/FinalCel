package com.example.dell.finalcel.interfaces;

import com.example.dell.finalcel.fragmentos.accion;
import com.example.dell.finalcel.fragmentos.comedia;
import com.example.dell.finalcel.fragmentos.drama;
import com.example.dell.finalcel.fragmentos.infantil;
import com.example.dell.finalcel.fragmentos.terror;

public interface IFragments extends accion.OnFragmentInteractionListener, comedia.OnFragmentInteractionListener,
        infantil.OnFragmentInteractionListener, drama.OnFragmentInteractionListener, terror.OnFragmentInteractionListener{

}

