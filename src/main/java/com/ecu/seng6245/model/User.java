package com.ecu.seng6245.model;

public class User
{
	/**
	 *
	 * Constructor.
	 *
	 */
	public User()
	{

	}

	/** The first name. */
	private String firstName;

	/** the lastName. */
	private String lastName;

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return this.firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(final String firstName)
	{
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return this.lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(final String lastName)
	{
		this.lastName = lastName;
	}


}