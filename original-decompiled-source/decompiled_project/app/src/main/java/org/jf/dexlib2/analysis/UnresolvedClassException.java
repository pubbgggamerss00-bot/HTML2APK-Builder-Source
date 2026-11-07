package org.jf.dexlib2.analysis;

import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class UnresolvedClassException extends ExceptionWithContext {
    public UnresolvedClassException(Throwable th2) {
        super(th2);
    }

    public UnresolvedClassException(Throwable th2, String str, Object... objArr) {
        super(th2, str, objArr);
    }

    public UnresolvedClassException(String str, Object... objArr) {
        super(str, objArr);
    }
}
