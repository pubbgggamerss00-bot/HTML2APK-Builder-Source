package org.jf.util;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes3.dex */
public class IndentingWriter extends Writer {
    private static final String newLine = System.getProperty("line.separator");
    protected final Writer writer;
    protected final char[] buffer = new char[24];
    protected int indentLevel = 0;
    private boolean beginningOfLine = true;

    public IndentingWriter(Writer writer) {
        this.writer = writer;
    }

    private void writeLine(char[] cArr, int i10, int i11) throws IOException {
        if (this.beginningOfLine && i11 > 0) {
            writeIndent();
            this.beginningOfLine = false;
        }
        this.writer.write(cArr, i10, i11);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.writer.close();
    }

    public void deindent(int i10) {
        int i11 = this.indentLevel - i10;
        this.indentLevel = i11;
        if (i11 < 0) {
            this.indentLevel = 0;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.writer.flush();
    }

    public void indent(int i10) {
        int i11 = this.indentLevel + i10;
        this.indentLevel = i11;
        if (i11 < 0) {
            this.indentLevel = 0;
        }
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        if (i10 == 10) {
            this.writer.write(newLine);
            this.beginningOfLine = true;
        } else {
            if (this.beginningOfLine) {
                writeIndent();
            }
            this.beginningOfLine = false;
            this.writer.write(i10);
        }
    }

    public void writeIndent() throws IOException {
        for (int i10 = 0; i10 < this.indentLevel; i10++) {
            this.writer.write(32);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        write(charSequence.toString());
        return this;
    }

    private void writeLine(String str, int i10, int i11) throws IOException {
        if (this.beginningOfLine && i11 > 0) {
            writeIndent();
            this.beginningOfLine = false;
        }
        this.writer.write(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        write(charSequence.subSequence(i10, i11).toString());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            if (cArr[i10] == '\n') {
                writeLine(cArr, i13, i10 - i13);
                this.writer.write(newLine);
                this.beginningOfLine = true;
                i13 = i10 + 1;
                i10 = i13;
            } else {
                i10++;
            }
        }
        writeLine(cArr, i13, i10 - i13);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        int i12 = i11 + i10;
        int i13 = i10;
        while (i10 < i12) {
            i10 = str.indexOf(10, i13);
            if (i10 != -1 && i10 < i12) {
                writeLine(str, i13, i10 - i13);
                this.writer.write(newLine);
                this.beginningOfLine = true;
                i13 = i10 + 1;
            } else {
                writeLine(str, i13, i12 - i13);
                return;
            }
        }
    }
}
