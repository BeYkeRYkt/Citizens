package net.citizensnpcs.api.event;

import net.citizensnpcs.lib.HumanNPC;

public class NPCEvent extends CitizensEvent {
	private static final long serialVersionUID = 1L;
	private final HumanNPC npc;

	public NPCEvent(String name, HumanNPC npc) {
		super(name);
		this.npc = npc;
	}

	/**
	 * Get the npc involved in the event.
	 * 
	 * @return the npc involved in the event
	 */
	public HumanNPC getNPC() {
		return npc;
	}
}