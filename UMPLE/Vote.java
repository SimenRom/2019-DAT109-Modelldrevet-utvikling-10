/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.1.4448.81a70243a modeling language!*/



// line 2 "model.ump"
// line 20 "model.ump"
public class Vote
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Vote Attributes
  private String brukerid;
  private Stand standid;
  private int stemmevekt;

  //Vote Associations
  private Stand stand;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Vote(String aBrukerid, Stand aStandid, int aStemmevekt, Stand aStand)
  {
    brukerid = aBrukerid;
    standid = aStandid;
    stemmevekt = aStemmevekt;
    boolean didAddStand = setStand(aStand);
    if (!didAddStand)
    {
      throw new RuntimeException("Unable to create vote due to stand");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setBrukerid(String aBrukerid)
  {
    boolean wasSet = false;
    brukerid = aBrukerid;
    wasSet = true;
    return wasSet;
  }

  public boolean setStandid(Stand aStandid)
  {
    boolean wasSet = false;
    standid = aStandid;
    wasSet = true;
    return wasSet;
  }

  public boolean setStemmevekt(int aStemmevekt)
  {
    boolean wasSet = false;
    stemmevekt = aStemmevekt;
    wasSet = true;
    return wasSet;
  }

  public String getBrukerid()
  {
    return brukerid;
  }

  public Stand getStandid()
  {
    return standid;
  }

  public int getStemmevekt()
  {
    return stemmevekt;
  }
  /* Code from template association_GetOne */
  public Stand getStand()
  {
    return stand;
  }
  /* Code from template association_SetOneToMany */
  public boolean setStand(Stand aStand)
  {
    boolean wasSet = false;
    if (aStand == null)
    {
      return wasSet;
    }

    Stand existingStand = stand;
    stand = aStand;
    if (existingStand != null && !existingStand.equals(aStand))
    {
      existingStand.removeVote(this);
    }
    stand.addVote(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Stand placeholderStand = stand;
    this.stand = null;
    if(placeholderStand != null)
    {
      placeholderStand.removeVote(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "brukerid" + ":" + getBrukerid()+ "," +
            "stemmevekt" + ":" + getStemmevekt()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "standid" + "=" + (getStandid() != null ? !getStandid().equals(this)  ? getStandid().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "stand = "+(getStand()!=null?Integer.toHexString(System.identityHashCode(getStand())):"null");
  }
}
