package com.example.restoranyogiyo_016;

import java.util.ArrayList;
import java.util.List;

public class RestoDraw {
    private static int[] ridArray={
            R.drawable.angelinus,
            R.drawable.chigo,
            R.drawable.dimsum,
            R.drawable.michigo,
            R.drawable.pizza,
            R.drawable.pochajjang,
            R.drawable.salad,
            R.drawable.subway,
            R.drawable.sushi,
            R.drawable.xbux,
    };

    private static String[] filenameArray={
            "angelinus",
            "chigo",
            "dimsum",
            "michigo",
            "pizza",
            "pochajjang",
            "salad",
            "subway",
            "sushi",
            "xbux",

    };


    private static List<Resto> RestoDrawList;

    public static void init(){
        RestoDrawList = new ArrayList<>();
        int nArray= ridArray.length;;
        for(int i=0; i<nArray; i++){
            RestoDrawList.add(new RestoDrawList (ridArray[i],filenameArray[i]));
        }
    }



    public static List<Resto> getKatalogFotoList() {
        return RestoDrawList;
    }

    public static Resto getKatalogFotoAt(int i) {
        return RestoDrawList.get(i);
    }

}
