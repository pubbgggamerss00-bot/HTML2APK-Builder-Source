package org.jf.dexlib2.analysis;

import org.jf.util.ExceptionWithContext;

/* loaded from: classes3.dex */
public class AnalysisException extends ExceptionWithContext {
    public int codeAddress;

    public AnalysisException(Throwable th2) {
        super(th2);
    }

    public AnalysisException(Throwable th2, String str, Object... objArr) {
        super(th2, str, objArr);
    }

    public AnalysisException(String str, Object... objArr) {
        super(str, objArr);
    }
}
