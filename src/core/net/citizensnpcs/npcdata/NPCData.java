package net.citizensnpcs.npcdata;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;

import com.google.common.collect.Lists;

public class NPCData {
	private Location location = null;
	private ChatColor colour = ChatColor.WHITE;
	private List<ItemData> items = Lists.newArrayList();
	private Deque<String> texts = new ArrayDeque<String>();
	private boolean lookClose;
	private boolean talkClose;
	private String owner;
	private boolean talk;

	// Acts as a container for various npc data.
	public NPCData(Location loc, ChatColor colour, List<ItemData> items,
			Deque<String> texts, boolean talk, boolean lookClose,
			boolean talkClose, String owner) {
		this.setLocation(loc);
		this.setColour(colour);
		this.setItems(items);
		this.setTexts(texts);
		this.setLookClose(lookClose);
		this.setTalkClose(talkClose);
		this.setOwner(owner);
		this.setTalk(talk);
	}

	public NPCData() {
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Location getLocation() {
		return location;
	}

	public void setColour(ChatColor code) {
		this.colour = code;
	}

	public ChatColor getColour() {
		return colour;
	}

	public void setItems(List<ItemData> items) {
		this.items = items;
	}

	public List<ItemData> getItems() {
		return items;
	}

	public void setTexts(Deque<String> text) {
		this.texts = text;
	}

	public Deque<String> getTexts() {
		return texts;
	}

	public void setLookClose(boolean lookClose) {
		this.lookClose = lookClose;
	}

	public boolean isLookClose() {
		return lookClose;
	}

	public void setTalkClose(boolean talkClose) {
		this.talkClose = talkClose;
	}

	public boolean isTalkClose() {
		return talkClose;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public boolean isTalk() {
		return this.talk;
	}

	public void setTalk(boolean talk) {
		this.talk = talk;
	}
}