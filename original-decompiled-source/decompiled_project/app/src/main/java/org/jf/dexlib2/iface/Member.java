package org.jf.dexlib2.iface;

import java.util.Set;
import org.jf.dexlib2.HiddenApiRestriction;

/* loaded from: classes3.dex */
public interface Member extends Annotatable {
    int getAccessFlags();

    String getDefiningClass();

    Set<HiddenApiRestriction> getHiddenApiRestrictions();

    String getName();
}
