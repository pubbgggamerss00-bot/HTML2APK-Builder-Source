package org.jf.util;

import java.io.PrintStream;
import java.io.PrintWriter;
import org.bouncycastle.asn1.x509.DisplayText;

/* loaded from: classes3.dex */
public class ExceptionWithContext extends RuntimeException {
    private StringBuffer context;

    public ExceptionWithContext(String str, Object... objArr) {
        this(null, str, objArr);
    }

    private static String formatMessage(String str, Object... objArr) {
        if (str == null) {
            return null;
        }
        return String.format(str, objArr);
    }

    public static ExceptionWithContext withContext(Throwable th2, String str, Object... objArr) {
        ExceptionWithContext exceptionWithContext = th2 instanceof ExceptionWithContext ? (ExceptionWithContext) th2 : new ExceptionWithContext(th2);
        exceptionWithContext.addContext(String.format(str, objArr));
        return exceptionWithContext;
    }

    public void addContext(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        this.context.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        this.context.append('\n');
    }

    public String getContext() {
        return this.context.toString();
    }

    public void printContext(PrintStream printStream) {
        printStream.println(getMessage());
        printStream.print(this.context);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.context);
    }

    public ExceptionWithContext(Throwable th2) {
        this(th2, null, new Object[0]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExceptionWithContext(Throwable th2, String str, Object... objArr) {
        String message;
        if (str != null) {
            message = formatMessage(str, objArr);
        } else {
            message = th2 != null ? th2.getMessage() : null;
        }
        super(message, th2);
        if (th2 instanceof ExceptionWithContext) {
            String string = ((ExceptionWithContext) th2).context.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            this.context = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.context = new StringBuffer(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
    }

    public void printContext(PrintWriter printWriter) {
        printWriter.println(getMessage());
        printWriter.print(this.context);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.context);
    }
}
