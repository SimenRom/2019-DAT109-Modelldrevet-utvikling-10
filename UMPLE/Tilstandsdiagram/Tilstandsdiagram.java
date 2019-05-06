//%% NEW FILE Stemmesystem BEGINS HERE %%

/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4450.6749b7105 modeling language!*/



/**
 * @@@skipcppcompile - Contains Java Code
 * @@@skipphpcompile - Contains Java Code
 * @@@skiprubycompile - Contains Java Code
 */
// line 2 "model.ump"
// line 29 "model.ump"
public class Stemmesystem
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Stemmesystem State Machines
  public enum Stemme { IdleVelgStand, IdleVelgVekt, Ferdig }
  private Stemme stemme;
  public enum SeResultat { Avlogget, Palogget }
  private SeResultat seResultat;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Stemmesystem()
  {
    setStemme(Stemme.IdleVelgStand);
    setSeResultat(SeResultat.Avlogget);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public String getStemmeFullName()
  {
    String answer = stemme.toString();
    return answer;
  }

  public String getSeResultatFullName()
  {
    String answer = seResultat.toString();
    return answer;
  }

  public Stemme getStemme()
  {
    return stemme;
  }

  public SeResultat getSeResultat()
  {
    return seResultat;
  }

  private boolean __autotransition1249__()
  {
    boolean wasEventProcessed = false;
    
    Stemme aStemme = stemme;
    switch (aStemme)
    {
      case IdleVelgStand:
        exitStemme();
        setStemme(Stemme.IdleVelgVekt);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1250__()
  {
    boolean wasEventProcessed = false;
    
    Stemme aStemme = stemme;
    switch (aStemme)
    {
      case IdleVelgVekt:
        exitStemme();
        setStemme(Stemme.Ferdig);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1251__()
  {
    boolean wasEventProcessed = false;
    
    Stemme aStemme = stemme;
    switch (aStemme)
    {
      case Ferdig:
        exitStemme();
        setStemme(Stemme.IdleVelgStand);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1252__()
  {
    boolean wasEventProcessed = false;
    
    SeResultat aSeResultat = seResultat;
    switch (aSeResultat)
    {
      case Avlogget:
        exitSeResultat();
        setSeResultat(SeResultat.Palogget);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private boolean __autotransition1253__()
  {
    boolean wasEventProcessed = false;
    
    SeResultat aSeResultat = seResultat;
    switch (aSeResultat)
    {
      case Palogget:
        exitSeResultat();
        setSeResultat(SeResultat.Avlogget);
        wasEventProcessed = true;
        break;
      default:
        // Other states do respond to this event
    }

    return wasEventProcessed;
  }

  private void exitStemme()
  {
    switch(stemme)
    {
      case IdleVelgStand:
        // line 5 "model.ump"
        p??VelgeStand();
        break;
      case IdleVelgVekt:
        // line 8 "model.ump"
        p??StemmeGyldig();
        break;
      case Ferdig:
        // line 11 "model.ump"
        er();
        break;
    }
  }

  private void setStemme(Stemme aStemme)
  {
    stemme = aStemme;

    // entry actions and do activities
    switch(stemme)
    {
      case IdleVelgStand:
        __autotransition1249__();
        break;
      case IdleVelgVekt:
        __autotransition1250__();
        break;
      case Ferdig:
        __autotransition1251__();
        break;
    }
  }

  private void exitSeResultat()
  {
    switch(seResultat)
    {
      case Avlogget:
        // line 17 "model.ump"
        loggP??();
        break;
      case Palogget:
        // line 21 "model.ump"
        loggAv();
        break;
    }
  }

  private void setSeResultat(SeResultat aSeResultat)
  {
    seResultat = aSeResultat;

    // entry actions and do activities
    switch(seResultat)
    {
      case Avlogget:
        __autotransition1252__();
        break;
      case Palogget:
        __autotransition1253__();
        break;
    }
  }

  public void delete()
  {}

}