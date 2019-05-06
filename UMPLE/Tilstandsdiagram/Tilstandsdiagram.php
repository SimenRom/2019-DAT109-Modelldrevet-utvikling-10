//%% NEW FILE Stemmesystem BEGINS HERE %%


/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4450.6749b7105 modeling language!*/

// @@@skipcppcompile - Contains Java Code
// @@@skipphpcompile - Contains Java Code
// @@@skiprubycompile - Contains Java Code
class Stemmesystem
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Stemmesystem State Machines
  private static $StemmeIdleVelgStand = 1;
  private static $StemmeIdleVelgVekt = 2;
  private static $StemmeFerdig = 3;
  private $Stemme;

  private static $SeResultatAvlogget = 1;
  private static $SeResultatPalogget = 2;
  private $SeResultat;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public function __construct()
  {
    $this->setStemme(self::$StemmeIdleVelgStand);
    $this->setSeResultat(self::$SeResultatAvlogget);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public function getStemmeFullName()
  {
    $answer = $this->getStemme();
    return $answer;
  }

  public function getSeResultatFullName()
  {
    $answer = $this->getSeResultat();
    return $answer;
  }

  public function getStemme()
  {
    if ($this->Stemme == self::$StemmeIdleVelgStand) { return "StemmeIdleVelgStand"; }
    elseif ($this->Stemme == self::$StemmeIdleVelgVekt) { return "StemmeIdleVelgVekt"; }
    elseif ($this->Stemme == self::$StemmeFerdig) { return "StemmeFerdig"; }
    return null;
  }

  public function getSeResultat()
  {
    if ($this->SeResultat == self::$SeResultatAvlogget) { return "SeResultatAvlogget"; }
    elseif ($this->SeResultat == self::$SeResultatPalogget) { return "SeResultatPalogget"; }
    return null;
  }

  private function __autotransition1259__()
  {
    $wasEventProcessed = false;
    
    $aStemme = $this->Stemme;
    if ($aStemme == self::$StemmeIdleVelgStand)
    {
      $this->exitStemme();
      $this->setStemme(self::$StemmeIdleVelgVekt);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function __autotransition1260__()
  {
    $wasEventProcessed = false;
    
    $aStemme = $this->Stemme;
    if ($aStemme == self::$StemmeIdleVelgVekt)
    {
      $this->exitStemme();
      $this->setStemme(self::$StemmeFerdig);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function __autotransition1261__()
  {
    $wasEventProcessed = false;
    
    $aStemme = $this->Stemme;
    if ($aStemme == self::$StemmeFerdig)
    {
      $this->exitStemme();
      $this->setStemme(self::$StemmeIdleVelgStand);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function __autotransition1262__()
  {
    $wasEventProcessed = false;
    
    $aSeResultat = $this->SeResultat;
    if ($aSeResultat == self::$SeResultatAvlogget)
    {
      $this->exitSeResultat();
      $this->setSeResultat(self::$SeResultatPalogget);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function __autotransition1263__()
  {
    $wasEventProcessed = false;
    
    $aSeResultat = $this->SeResultat;
    if ($aSeResultat == self::$SeResultatPalogget)
    {
      $this->exitSeResultat();
      $this->setSeResultat(self::$SeResultatAvlogget);
      $wasEventProcessed = true;
    }
    return $wasEventProcessed;
  }

  private function exitStemme()
  {
    if ($this->Stemme == self::$StemmeIdleVelgStand)
    {
      p??VelgeStand();
    }
    elseif ($this->Stemme == self::$StemmeIdleVelgVekt)
    {
      p??StemmeGyldig();
    }
    elseif ($this->Stemme == self::$StemmeFerdig)
    {
      er();
    }
  }

  private function setStemme($aStemme)
  {
    $this->Stemme = $aStemme;

    // entry actions and do activities
    if ($this->Stemme == self::$StemmeIdleVelgStand)
    {
      $this->__autotransition1259__();
    }
    elseif ($this->Stemme == self::$StemmeIdleVelgVekt)
    {
      $this->__autotransition1260__();
    }
    elseif ($this->Stemme == self::$StemmeFerdig)
    {
      $this->__autotransition1261__();
    }
  }

  private function exitSeResultat()
  {
    if ($this->SeResultat == self::$SeResultatAvlogget)
    {
      loggP??();
    }
    elseif ($this->SeResultat == self::$SeResultatPalogget)
    {
      loggAv();
    }
  }

  private function setSeResultat($aSeResultat)
  {
    $this->SeResultat = $aSeResultat;

    // entry actions and do activities
    if ($this->SeResultat == self::$SeResultatAvlogget)
    {
      $this->__autotransition1262__();
    }
    elseif ($this->SeResultat == self::$SeResultatPalogget)
    {
      $this->__autotransition1263__();
    }
  }

  public function equals($compareTo)
  {
    return $this == $compareTo;
  }

  public function delete()
  {}

}