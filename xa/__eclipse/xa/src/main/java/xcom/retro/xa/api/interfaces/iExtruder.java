

package xcom.retro.xa.api.interfaces ;

import java.io.PrintWriter ;
import java.util.Map ;

import xcom.retro.xa.Segment ;

public interface iExtruder {

	public void extrude(PrintWriter out, Map<String, Segment> segments) ;
}
