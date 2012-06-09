package jasper;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Holds attributes that do not contribute to the disassembly,
 * such as stack map.
 *
 * @author Kohsuke Kawaguchi
 */
public class KnownIgnoredAttribute extends Attribute {
   public KnownIgnoredAttribute(DataInputStream ios, Pool_Collection pool, int attributeIndex) throws IOException {
      super(ios, pool, attributeIndex);
       ios.readFully(new byte[length]);
   }
}

