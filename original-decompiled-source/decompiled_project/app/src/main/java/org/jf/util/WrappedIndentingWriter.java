package org.jf.util;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import nc.k0;

/* loaded from: classes3.dex */
public class WrappedIndentingWriter extends FilterWriter {
    private int currentIndent;
    private final StringBuilder line;
    private final int maxIndent;
    private final int maxWidth;

    public WrappedIndentingWriter(Writer writer, int i10, int i11) {
        super(writer);
        this.currentIndent = 0;
        this.line = new StringBuilder();
        this.maxIndent = i10;
        this.maxWidth = i11;
    }

    private int getIndent() {
        int i10 = this.currentIndent;
        if (i10 < 0) {
            return 0;
        }
        int i11 = this.maxIndent;
        return i10 > i11 ? i11 : i10;
    }

    private void wrapLine() throws IOException {
        ArrayList arrayListA = k0.a(StringWrapper.wrapStringOnBreaks(this.line.toString(), this.maxWidth));
        ((FilterWriter) this).out.write((String) arrayListA.get(0), 0, ((String) arrayListA.get(0)).length());
        ((FilterWriter) this).out.write(10);
        StringBuilder sb = this.line;
        sb.replace(0, sb.length(), "");
        writeIndent();
        for (int i10 = 1; i10 < arrayListA.size(); i10++) {
            if (i10 > 1) {
                write(10);
            }
            write((String) arrayListA.get(i10));
        }
    }

    private void writeIndent() throws IOException {
        for (int i10 = 0; i10 < getIndent(); i10++) {
            write(32);
        }
    }

    public void deindent(int i10) {
        this.currentIndent -= i10;
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        ((FilterWriter) this).out.write(this.line.toString());
        StringBuilder sb = this.line;
        sb.replace(0, sb.length(), "");
    }

    public void indent(int i10) {
        this.currentIndent += i10;
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i10) throws IOException {
        if (i10 != 10) {
            this.line.append((char) i10);
            if (this.line.length() > this.maxWidth) {
                wrapLine();
                return;
            }
            return;
        }
        ((FilterWriter) this).out.write(this.line.toString());
        ((FilterWriter) this).out.write(i10);
        StringBuilder sb = this.line;
        sb.replace(0, sb.length(), "");
        writeIndent();
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write(cArr[i12 + i10]);
        }
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        for (int i12 = 0; i12 < i11; i12++) {
            write(str.charAt(i12 + i10));
        }
    }
}
