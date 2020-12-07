

/*
 *  A generic class modifying an attribute to be used for roll or AC
 */
public class ModifyAttribute {
	

	private Object strength;
	private Object intelligence;
	private Object constitution;
	private Object dexterity;
	private Object wisdom;
	private Object charisma;
	private Object strMod;
	private Object dexMod;
	private Object conMod;
	private Object intMod;
	private Object wisMod;
	private Object chaMod;

	public ModifyAttribute() {
        this.strength = getStat();
        this.dexterity = getStat();
        this.constitution = getStat();
        this.intelligence = getStat();
        this.wisdom = getStat();
        this.charisma = getStat();

        this.strMod = getMod(this.strength);
        this.dexMod = getMod(this.dexterity);
        this.conMod = getMod(this.constitution);
        this.intMod = getMod(this.intelligence);
        this.wisMod = getMod(this.wisdom);
        this.chaMod = getMod(this.charisma);

}


	private Object getStat() {
		
		return null;
	}
}