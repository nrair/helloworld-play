package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index(String nom) {
    	String x="Bonjour "+nom;
        render(x);
    }
    
    public static void bonjour(String nom,String prenom,int age,String filiere) {
//    	nom="rair";
//    	prenom="nisrine";
//    	age=20;
//    	filiere="Informatique";
    	render(nom,prenom,age,filiere);
    }

}