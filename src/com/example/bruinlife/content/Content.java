package com.example.bruinlife.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 */
public class Content {

	/**
	 * An array of items.
	 */
	public static List<MenuItem> ITEMS = new ArrayList<MenuItem>();

	/**
	 * A map of items, by ID.
	 */
	public static Map<String, MenuItem> ITEM_MAP = new HashMap<String, MenuItem>();

	static {
		// Add 3 sample items.
		addItem(new MenuItem("1", "De Neve"));
		addItem(new MenuItem("2", "Covel"));
		addItem(new MenuItem("3", "Sproul"));
		addItem(new MenuItem("4", "Feast"));
	}

	private static void addItem(MenuItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * Item representing a piece of content.
	 */
	public static class MenuItem {
		public String id;
		public String content;
		public String description;

		public MenuItem(String id, String content) {
			this.id = id;
			this.content = content;
			this.description = "sample description";
		}
		
		public MenuItem(String id, String content, String description) {
			this.id = id;
			this.content = content;
			this.description = description;
		}

		@Override
		public String toString() {
			return content;
		}
	}
}
