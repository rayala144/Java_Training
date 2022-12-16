package com.keyword.thisKeyword;

public class Example {
	
	static class Weapon{
		int damage;
		int cost;
		String type;
		int no_of_attachments;
		
		public Weapon(int damage, int cost, String type, int no_of_attachments) {
			super();
			this.damage = damage;
			this.cost = cost;
			this.type = type;
			this.no_of_attachments = no_of_attachments;
		}

		@Override
		public String toString() {
			return "Weapon [damage=" + damage + ", cost=" + cost + ", type=" + type + ", no_of_attachments="
					+ no_of_attachments + "]";
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Weapon sword = new Weapon(40, 10, "melee", 0);
		System.out.println(sword.toString());

	}

}
