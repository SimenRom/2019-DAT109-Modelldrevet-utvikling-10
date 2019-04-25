/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 14 "model.ump"
// line 31 "model.ump"
public class AverageStandScore
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //AverageStandScore Attributes
  private String standNavn;
  private double vote;
  private int amount;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public AverageStandScore(String aStandNavn, double aVote, int aAmount)
  {
    standNavn = aStandNavn;
    vote = aVote;
    amount = aAmount;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setStandNavn(String aStandNavn)
  {
    boolean wasSet = false;
    standNavn = aStandNavn;
    wasSet = true;
    return wasSet;
  }

  public boolean setVote(double aVote)
  {
    boolean wasSet = false;
    vote = aVote;
    wasSet = true;
    return wasSet;
  }

  public boolean setAmount(int aAmount)
  {
    boolean wasSet = false;
    amount = aAmount;
    wasSet = true;
    return wasSet;
  }

  public String getStandNavn()
  {
    return standNavn;
  }

  public double getVote()
  {
    return vote;
  }

  public int getAmount()
  {
    return amount;
  }

  public void delete()
  {}


  public String toString()
  {
    return super.toString() + "["+
            "standNavn" + ":" + getStandNavn()+ "," +
            "vote" + ":" + getVote()+ "," +
            "amount" + ":" + getAmount()+ "]";
  }
}
