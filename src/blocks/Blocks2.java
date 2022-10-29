package blocks;
//Re-assign

/* SIB - Static Initialization Block
 * Used to initialize Static Members
 * IIB - Instance Initialization Block 
 *  Used to initialize Instance Members
 *
 *
 *Blocks are the only place to initialize final variables
 */
public class Blocks2 {
final int i=1;
final static int j=2;

Blocks2(){
	//i=5;// - cant initialize final variables
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
	//i=5; - Only initialization for instance instance variable - No re assigning
}

static{
	//j=10; -  Only initialization for static instance variable - No re assigning
	
	//i=2; - cant initialize instance member in static block
}


}
