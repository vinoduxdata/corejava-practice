package blocks;
//Assign

/* SIB - Static Initialization Block
 * Used to initialize Static Members
 * IIB - Instance Initialization Block 
 *  Used to initialize Instance Members
 *
 *
 *Blocks are the only place to initialize final variables
 */
public class Blocks {
final int i;
final static int j;

Blocks(){
	//i=5; - cant initialize final variables
	//j=10;
}

void staticmethod(){
	//i=5;
	//j=10;
	
}
void nonstaticmethod(){
	//i=5;
	//j=10;
}

{
	i=5;
}

static{
	j=10;
	//i=2; - cant initialize instance member in static block
}


}
