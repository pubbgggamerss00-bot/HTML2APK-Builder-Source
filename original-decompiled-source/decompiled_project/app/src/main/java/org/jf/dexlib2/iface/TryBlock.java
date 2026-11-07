package org.jf.dexlib2.iface;

import java.util.List;
import org.jf.dexlib2.iface.ExceptionHandler;

/* loaded from: classes3.dex */
public interface TryBlock<EH extends ExceptionHandler> {
    boolean equals(Object obj);

    int getCodeUnitCount();

    List<? extends EH> getExceptionHandlers();

    int getStartCodeAddress();
}
