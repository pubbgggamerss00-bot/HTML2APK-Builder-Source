package org.jf.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/* loaded from: classes3.dex */
public final class TwoColumnOutput {
    private String[] leftLines;
    private final int leftWidth;
    private final Writer out;
    private String[] rightLines;
    private final int rightWidth;
    private final String spacer;

    public TwoColumnOutput(Writer writer, int i10, int i11, String str) {
        this.leftLines = null;
        this.rightLines = null;
        if (i10 < 1) {
            throw new IllegalArgumentException("leftWidth < 1");
        }
        if (i11 < 1) {
            throw new IllegalArgumentException("rightWidth < 1");
        }
        this.out = writer;
        this.leftWidth = i10;
        this.rightWidth = i11;
        this.spacer = str;
    }

    private static void writeSpaces(Writer writer, int i10) throws IOException {
        while (i10 > 0) {
            writer.write(32);
            i10--;
        }
    }

    public void write(String str, String str2) throws IOException {
        String str3;
        int length;
        this.leftLines = StringWrapper.wrapString(str, this.leftWidth, this.leftLines);
        String[] strArrWrapString = StringWrapper.wrapString(str2, this.rightWidth, this.rightLines);
        this.rightLines = strArrWrapString;
        int length2 = this.leftLines.length;
        int length3 = strArrWrapString.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length2 && i10 >= length3) {
                return;
            }
            String str4 = null;
            if (i10 < length2) {
                str3 = this.leftLines[i10];
                if (str3 == null) {
                    length2 = i10;
                }
            } else {
                str3 = null;
            }
            if (i10 < length3 && (str4 = this.rightLines[i10]) == null) {
                length3 = i10;
            }
            if (str3 != null || str4 != null) {
                if (str3 != null) {
                    this.out.write(str3);
                    length = str3.length();
                } else {
                    length = 0;
                }
                int i11 = this.leftWidth - length;
                if (i11 > 0) {
                    writeSpaces(this.out, i11);
                }
                this.out.write(this.spacer);
                if (str4 != null) {
                    this.out.write(str4);
                }
                this.out.write(10);
            }
            i10++;
        }
    }

    public TwoColumnOutput(OutputStream outputStream, int i10, int i11, String str) {
        this(new OutputStreamWriter(outputStream), i10, i11, str);
    }
}
