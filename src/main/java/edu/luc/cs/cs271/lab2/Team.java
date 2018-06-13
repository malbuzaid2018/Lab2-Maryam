package edu.luc.cs.cs271.lab2;

/** A sports team. */
public class Team {
  /** The team's name. */
  private String name;

  /** The team's head coach. */
  private String headcoach;

  /** The team's monetary funding level in thousands of US$. */
  private int funding;

  /** Constructs a new team. */
  public Team(final String name, final String headcoach, final int funding) {
    if (name == null) {
      throw new IllegalArgumentException("name is null");
    }
    // TODO validity checking for headcoach
    // TODO validity checking for funding
    this.name = name;
    // TODO complete this constructor

    // DONE Checking headcoach

    if (headcoach == null) {
      throw new IllegalArgumentException("headcoach is null");
    }

    this.headcoach = headcoach;

    // Done validity
    if (funding <= 0) {
      throw new IllegalArgumentException("Funding must be greater than 0");
    }

    this.funding = funding;

    // DONE
  }

  /** Returns the team's name. */
  public String getName() {
    return this.name;
  }

  /** Returns the team's head coach. */
  public String getHeadcoach() {
    // DONE
    return this.headcoach;
  }

  /** Returns the team's funding level. */
  public int getFunding() {
    // DONE
    return this.funding;
  }
}
