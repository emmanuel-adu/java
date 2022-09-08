package com.emmanuelscode;

import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    // Interface methods
    List<String> write ();
    void read (List<String> savedValues);

}
