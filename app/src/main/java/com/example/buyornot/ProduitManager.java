package com.example.buyornot;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ProduitManager {
    private static final String TABLE_NAME = "produit";
    public static final String KEY_ID_PRODUIT="pro_id";
    public static final String KEY_LIBELLE_PRODUIT="pro_libelle";
    public static final String KEY_CODEBARRE_PRODUIT="pro_codeBarre";
    public static final String KEY_QUANTITE_PRODUIT="pro_quantite";
    public static final String KEY_INGREDIENTS_PRODUIT="pro_ingredients";
    public static final String KEY_ENERGIE_PRODUIT="pro_energie";
    public static final String KEY_MATIEREGRASSE_PRODUIT="pro_matiereGrasse";
    public static final String KEY_ACIDESGRAS_PRODUIT="pro_acidesGras";
    public static final String KEY_GLUCIDE_PRODUIT="pro_glucide";
    public static final String KEY_SUCRE_PRODUIT="pro_sucre";
    public static final String KEY_PROTEINE_PRODUIT="pro_proteine";
    public static final String KEY_SEL_PRODUIT="pro_sel";
    public static final String KEY_SODIUM_PRODUIT="pro_sodium";
    public static final String KEY_NUTRISCORE_PRODUIT="pro_nutriscore";
    public static final String KEY_FRUITLEGUMES_PRODUIT="pro_fruitLegumes";

    public static final String CREATE_TABLE_PRODUIT = "CREATE TABLE "+TABLE_NAME+
        " ( "+KEY_ID_PRODUIT+" INTEGER primary key AUTOINCREMENT," +
        " "+KEY_LIBELLE_PRODUIT+" TEXT," +
        " "+KEY_CODEBARRE_PRODUIT+" LONG," +
        " "+KEY_QUANTITE_PRODUIT+" INT," +
        " "+KEY_INGREDIENTS_PRODUIT+" TEXT," +
        " "+KEY_ENERGIE_PRODUIT+" INT," +
        " "+KEY_MATIEREGRASSE_PRODUIT+" INT," +
        " "+KEY_ACIDESGRAS_PRODUIT+" INT," +
        " "+KEY_GLUCIDE_PRODUIT+" INT," +
        " "+KEY_SUCRE_PRODUIT+" INT," +
        " "+KEY_PROTEINE_PRODUIT+" INT," +
        " "+KEY_SEL_PRODUIT+" INT," +
        " "+KEY_SODIUM_PRODUIT+" INT," +
        " "+KEY_NUTRISCORE_PRODUIT+" INT" +
        " "+KEY_FRUITLEGUMES_PRODUIT+" INT" +
        " );";
    private MySQLite maBaseSQLite; // notre gestionnaire du fichier SQLite
    private SQLiteDatabase db;
    // Constructeur
    public ProduitManager(Context context)
    {
        maBaseSQLite = MySQLite.getInstance(context);
    }
    public void open()
    {
        //on ouvre la table en lecture/écriture
        db = maBaseSQLite.getWritableDatabase();
    }
    public void close()
    {
        //on ferme l'accès à la BDD
        db.close();
    }
    public long addProduit(Produit produit) {
        // Ajout d'un enregistrement dans la table
        ContentValues values = new ContentValues();

        values.put(KEY_LIBELLE_PRODUIT, produit.getLibelle());
        values.put(KEY_CODEBARRE_PRODUIT,produit.getCodeBarre());
        values.put(KEY_QUANTITE_PRODUIT,produit.getQuantite());
        values.put(KEY_INGREDIENTS_PRODUIT,produit.getIngredients());
        values.put(KEY_ENERGIE_PRODUIT,produit.getEnergie());
        values.put(KEY_MATIEREGRASSE_PRODUIT,produit.getMatiereGrasse());
        values.put(KEY_ACIDESGRAS_PRODUIT,produit.getAcidesGras());
        values.put(KEY_GLUCIDE_PRODUIT,produit.getGlucides());
        values.put(KEY_SUCRE_PRODUIT,produit.getSucres());
        values.put(KEY_PROTEINE_PRODUIT,produit.getProteine());
        values.put(KEY_SEL_PRODUIT,produit.getSel());
        values.put(KEY_SODIUM_PRODUIT,produit.getSodium());
        values.put(KEY_NUTRISCORE_PRODUIT,produit.getNutriscore());
        values.put(KEY_FRUITLEGUMES_PRODUIT,produit.getFruitsLegumes());

        // insert() retourne l'id du nouvel enregistrement inséré, ou -1 en cas d'erreur
        return db.insert(TABLE_NAME,null,values);
    }

    public int modProduit(Produit produit) {
        // modification d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la requête
        ContentValues values = new ContentValues();

        values.put(KEY_LIBELLE_PRODUIT, produit.getLibelle());
        values.put(KEY_CODEBARRE_PRODUIT,produit.getCodeBarre());
        values.put(KEY_QUANTITE_PRODUIT,produit.getQuantite());
        values.put(KEY_INGREDIENTS_PRODUIT,produit.getIngredients());
        values.put(KEY_ENERGIE_PRODUIT,produit.getEnergie());
        values.put(KEY_MATIEREGRASSE_PRODUIT,produit.getMatiereGrasse());
        values.put(KEY_ACIDESGRAS_PRODUIT,produit.getAcidesGras());
        values.put(KEY_GLUCIDE_PRODUIT,produit.getGlucides());
        values.put(KEY_SUCRE_PRODUIT,produit.getSucres());
        values.put(KEY_PROTEINE_PRODUIT,produit.getProteine());
        values.put(KEY_SEL_PRODUIT,produit.getSel());
        values.put(KEY_SODIUM_PRODUIT,produit.getSodium());
        values.put(KEY_NUTRISCORE_PRODUIT,produit.getNutriscore());
        values.put(KEY_FRUITLEGUMES_PRODUIT,produit.getFruitsLegumes());

        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {produit.getId()+""};
        return db.update(TABLE_NAME, values, where, whereArgs);
    }
    public int supProduit(Produit produit) {
        // suppression d'un enregistrement
        // valeur de retour : (int) nombre de lignes affectées par la clause WHERE, 0 sinon
        String where = KEY_ID_PRODUIT+" = ?";
        String[] whereArgs = {produit.getId()+""};
        return db.delete(TABLE_NAME, where, whereArgs);
    }
    public Produit getProduit(int id) {
        // Retourne le produit dont l'id est passé en paramètre
        Produit a=new Produit();
        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_NAME + " where pro_id = " + id , null);
        if (c.moveToFirst()) {
            a.setId(c.getInt(c.getColumnIndex(KEY_ID_PRODUIT)));
            a.setLibelle(c.getString(c.getColumnIndex(KEY_LIBELLE_PRODUIT)));
            a.setCodeBarre(c.getLong(c.getColumnIndex(KEY_CODEBARRE_PRODUIT)));
            a.setQuantite(c.getInt(c.getColumnIndex(KEY_QUANTITE_PRODUIT)));
            a.setIngredients(c.getString(c.getColumnIndex(KEY_INGREDIENTS_PRODUIT)));
            a.setEnergie(c.getInt(c.getColumnIndex(KEY_ENERGIE_PRODUIT)));
            a.setMatiereGrasse(c.getInt(c.getColumnIndex(KEY_MATIEREGRASSE_PRODUIT)));
            a.setAcidesGras(c.getInt(c.getColumnIndex(KEY_ACIDESGRAS_PRODUIT)));
            a.setGlucides(c.getInt(c.getColumnIndex(KEY_GLUCIDE_PRODUIT)));
            a.setSucres(c.getInt(c.getColumnIndex(KEY_SUCRE_PRODUIT)));
            a.setProteine(c.getInt(c.getColumnIndex(KEY_PROTEINE_PRODUIT)));
            a.setSel(c.getInt(c.getColumnIndex(KEY_SEL_PRODUIT)));
            a.setSodium(c.getInt(c.getColumnIndex(KEY_SODIUM_PRODUIT)));
            a.setNutriscore(c.getInt(c.getColumnIndex(KEY_NUTRISCORE_PRODUIT)));
            a.setFruitsLegumes(c.getInt(c.getColumnIndex(KEY_FRUITLEGUMES_PRODUIT)));
            c.close();
        }
        return a;
    }

    public Cursor getLesProduits() {
        // sélection de tous les enregistrements de la table
        return db.rawQuery("SELECT * FROM "+TABLE_NAME, null);
    }
} // class AnimalManager