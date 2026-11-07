package org.jf.util;

import java.io.PrintStream;
import java.text.BreakIterator;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class StringWrapper {
    private static String[] addString(String[] strArr, String str, int i10) {
        if (i10 >= strArr.length) {
            strArr = enlargeArray(strArr, (int) Math.ceil((strArr.length + 1) * 1.5d));
        }
        strArr[i10] = str;
        return strArr;
    }

    private static String[] enlargeArray(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        return strArr2;
    }

    public static void printWrappedString(PrintStream printStream, String str, int i10) {
        Iterator<String> it = wrapStringOnBreaks(str, i10).iterator();
        while (it.hasNext()) {
            printStream.println(it.next());
        }
    }

    public static String[] wrapString(String str, int i10, String[] strArr) {
        int i11;
        if (strArr == null) {
            strArr = new String[(int) (((str.length() / i10) * 1.5d) + 1.0d)];
        }
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < str.length()) {
            if (str.charAt(i12) == '\n') {
                i11 = i14 + 1;
                strArr = addString(strArr, str.substring(i13, i12), i14);
                i13 = i12 + 1;
            } else if (i12 - i13 == i10) {
                i11 = i14 + 1;
                strArr = addString(strArr, str.substring(i13, i12), i14);
                i13 = i12;
            } else {
                i12++;
            }
            i14 = i11;
            i12++;
        }
        if (i13 != i12 || i12 == 0) {
            strArr = addString(strArr, str.substring(i13), i14, strArr.length + 1);
            i14++;
        }
        if (i14 < strArr.length) {
            strArr[i14] = null;
        }
        return strArr;
    }

    public static Iterable<String> wrapStringOnBreaks(final String str, final int i10) {
        final BreakIterator lineInstance = BreakIterator.getLineInstance();
        lineInstance.setText(str);
        return new Iterable<String>() { // from class: org.jf.util.StringWrapper.1
            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return new Iterator<String>() { // from class: org.jf.util.StringWrapper.1.1
                    private String nextLine;
                    private int currentLineStart = 0;
                    private boolean nextLineSet = false;

                    private void calculateNext() {
                        int iLast;
                        String str2;
                        int i11;
                        int iFollowing = this.currentLineStart;
                        do {
                            iFollowing = lineInstance.following(iFollowing);
                            if (iFollowing == -1) {
                                iLast = lineInstance.last();
                                if (iLast <= this.currentLineStart) {
                                    this.nextLine = null;
                                    this.nextLineSet = true;
                                    return;
                                }
                            } else {
                                int i12 = iFollowing - this.currentLineStart;
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                if (i12 > i10) {
                                    iLast = lineInstance.preceding(iFollowing);
                                    int i13 = this.currentLineStart;
                                    if (iLast <= i13) {
                                        iLast = i10 + i13;
                                    }
                                } else {
                                    str2 = str;
                                    i11 = iFollowing - 1;
                                }
                            }
                            this.nextLine = str.substring(this.currentLineStart, iLast);
                            this.nextLineSet = true;
                            this.currentLineStart = iLast;
                            return;
                        } while (str2.charAt(i11) != '\n');
                        this.nextLine = str.substring(this.currentLineStart, i11);
                        this.nextLineSet = true;
                        this.currentLineStart = iFollowing;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        if (!this.nextLineSet) {
                            calculateNext();
                        }
                        return this.nextLine != null;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }

                    @Override // java.util.Iterator
                    public String next() {
                        String str2 = this.nextLine;
                        this.nextLine = null;
                        this.nextLineSet = false;
                        return str2;
                    }
                };
            }
        };
    }

    private static String[] addString(String[] strArr, String str, int i10, int i11) {
        if (i10 >= strArr.length) {
            strArr = enlargeArray(strArr, i11);
        }
        strArr[i10] = str;
        return strArr;
    }
}
