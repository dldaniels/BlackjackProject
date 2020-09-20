package com.skilldistillery.common.things;

import com.skilldistillery.blackjack.BlackjackDealer;

public class Casino {
	private String name;
	private String location;
	private BlackjackDealer dealer;

	public Casino(String name, String location) {
		super();
		this.name = name;
		this.location = location;
		BlackjackDealer dealer = new BlackjackDealer();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public BlackjackDealer getDealer() {
		return dealer;
	}

	public void setDealer(BlackjackDealer dealer) {
		this.dealer = dealer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dealer == null) ? 0 : dealer.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Casino))
			return false;
		Casino other = (Casino) obj;
		if (dealer == null) {
			if (other.dealer != null)
				return false;
		} else if (!dealer.equals(other.dealer))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Casino [name=");
		builder.append(name);
		builder.append(", location=");
		builder.append(location);
		builder.append(", dealer=");
		builder.append(dealer);
		builder.append("]");
		return builder.toString();
	}

}
