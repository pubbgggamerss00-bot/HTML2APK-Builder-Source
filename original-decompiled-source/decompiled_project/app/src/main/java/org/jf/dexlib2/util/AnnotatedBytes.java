package org.jf.dexlib2.util;

import com.google.protobuf.DescriptorProtos;
import d0.h0;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import k1.q;
import org.jf.util.ExceptionWithContext;
import org.jf.util.Hex;
import org.jf.util.TwoColumnOutput;

/* loaded from: classes3.dex */
public class AnnotatedBytes {
    private int cursor;
    private int indentLevel;
    private int outputWidth;
    private TreeMap<Integer, AnnotationEndpoint> annotatations = new TreeMap<>();
    private int hexCols = 8;
    private int startLimit = -1;
    private int endLimit = -1;

    public static class AnnotationEndpoint {
        public final List<AnnotationItem> pointAnnotations;
        public AnnotationItem rangeAnnotation;

        private AnnotationEndpoint() {
            this.pointAnnotations = new ArrayList();
            this.rangeAnnotation = null;
        }
    }

    public static class AnnotationItem {
        public final String annotation;
        public final int indentLevel;

        public AnnotationItem(int i10, String str) {
            this.indentLevel = i10;
            this.annotation = str;
        }
    }

    public AnnotatedBytes(int i10) {
        this.outputWidth = i10;
    }

    private String formatAnnotation(int i10, String str) {
        return formatAnnotation(i10, this.annotatations.higherKey(Integer.valueOf(i10)), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void annotate(int i10, String str, Object... objArr) {
        AnnotationItem annotationItem;
        AnnotationEndpoint value;
        Map.Entry<Integer, AnnotationEndpoint> entryHigherEntry;
        AnnotationItem annotationItem2;
        int i11;
        int i12;
        int i13 = this.startLimit;
        if (i13 != -1 && (i11 = this.endLimit) != -1 && ((i12 = this.cursor) < i13 || i12 >= i11)) {
            throw new ExceptionWithContext("Annotating outside the parent bounds", new Object[0]);
        }
        if (objArr != null && objArr.length > 0) {
            str = String.format(str, objArr);
        }
        int i14 = this.cursor;
        int i15 = i14 + i10;
        AnnotationEndpoint annotationEndpoint = this.annotatations.get(Integer.valueOf(i14));
        if (annotationEndpoint == null) {
            Map.Entry<Integer, AnnotationEndpoint> entryLowerEntry = this.annotatations.lowerEntry(Integer.valueOf(this.cursor));
            if (entryLowerEntry != null && (annotationItem2 = entryLowerEntry.getValue().rangeAnnotation) != null) {
                int i16 = this.cursor;
                throw new ExceptionWithContext("Cannot add annotation %s, due to existing annotation %s", formatAnnotation(i16, Integer.valueOf(i10 + i16), str), formatAnnotation(entryLowerEntry.getKey().intValue(), annotationItem2.annotation));
            }
        } else if (i10 > 0 && (annotationItem = annotationEndpoint.rangeAnnotation) != null) {
            int i17 = this.cursor;
            throw new ExceptionWithContext("Cannot add annotation %s, due to existing annotation %s", formatAnnotation(i17, Integer.valueOf(i10 + i17), str), formatAnnotation(this.cursor, annotationItem.annotation));
        }
        if (i10 <= 0 || (entryHigherEntry = this.annotatations.higherEntry(Integer.valueOf(this.cursor))) == null) {
            value = null;
        } else {
            Integer key = entryHigherEntry.getKey();
            int iIntValue = key.intValue();
            if (iIntValue < i15) {
                AnnotationEndpoint value2 = entryHigherEntry.getValue();
                AnnotationItem annotationItem3 = value2.rangeAnnotation;
                if (annotationItem3 != null) {
                    int i18 = this.cursor;
                    throw new ExceptionWithContext("Cannot add annotation %s, due to existing annotation %s", formatAnnotation(i18, Integer.valueOf(i10 + i18), str), formatAnnotation(iIntValue, annotationItem3.annotation));
                }
                if (value2.pointAnnotations.size() > 0) {
                    int i19 = this.cursor;
                    throw new ExceptionWithContext("Cannot add annotation %s, due to existing annotation %s", formatAnnotation(i19, Integer.valueOf(i10 + i19), str), formatAnnotation(iIntValue, key, value2.pointAnnotations.get(0).annotation));
                }
                int i20 = this.cursor;
                throw new ExceptionWithContext("Cannot add annotation %s, due to existing annotation endpoint at %d", formatAnnotation(i20, Integer.valueOf(i10 + i20), str), key);
            }
            if (iIntValue == i15) {
                value = entryHigherEntry.getValue();
            }
        }
        if (annotationEndpoint == null) {
            annotationEndpoint = new AnnotationEndpoint();
            this.annotatations.put(Integer.valueOf(this.cursor), annotationEndpoint);
        }
        if (i10 == 0) {
            annotationEndpoint.pointAnnotations.add(new AnnotationItem(this.indentLevel, str));
        } else {
            annotationEndpoint.rangeAnnotation = new AnnotationItem(this.indentLevel, str);
            if (value == null) {
                this.annotatations.put(Integer.valueOf(i15), new AnnotationEndpoint());
            }
        }
        this.cursor += i10;
    }

    public void annotateTo(int i10, String str, Object... objArr) {
        annotate(i10 - this.cursor, str, objArr);
    }

    public void clearLimit() {
        this.startLimit = -1;
        this.endLimit = -1;
    }

    public void deindent() {
        int i10 = this.indentLevel - 1;
        this.indentLevel = i10;
        if (i10 < 0) {
            this.indentLevel = 0;
        }
    }

    public int getAnnotationWidth() {
        int i10 = this.hexCols;
        return this.outputWidth - ((i10 / 2) + ((i10 * 2) + 8));
    }

    public int getCursor() {
        return this.cursor;
    }

    public void indent() {
        this.indentLevel++;
    }

    public void moveBy(int i10) {
        this.cursor += i10;
    }

    public void moveTo(int i10) {
        this.cursor = i10;
    }

    public void setLimit(int i10, int i11) {
        this.startLimit = i10;
        this.endLimit = i11;
    }

    public void writeAnnotations(Writer writer, byte[] bArr, int i10) throws IOException {
        int annotationWidth = getAnnotationWidth();
        int i11 = (this.outputWidth - annotationWidth) - 1;
        String strC = h0.c(DescriptorProtos.Edition.EDITION_2023_VALUE, " ");
        TwoColumnOutput twoColumnOutput = new TwoColumnOutput(writer, i11, annotationWidth, "|");
        Integer[] numArr = (Integer[]) this.annotatations.keySet().toArray(new Integer[this.annotatations.size()]);
        AnnotationEndpoint[] annotationEndpointArr = (AnnotationEndpoint[]) this.annotatations.values().toArray(new AnnotationEndpoint[this.annotatations.size()]);
        int i12 = 0;
        while (true) {
            String string = "";
            if (i12 >= numArr.length - 1) {
                break;
            }
            int iIntValue = numArr[i12].intValue();
            int i13 = i12 + 1;
            int iIntValue2 = numArr[i13].intValue();
            AnnotationEndpoint annotationEndpoint = annotationEndpointArr[i12];
            for (AnnotationItem annotationItem : annotationEndpoint.pointAnnotations) {
                StringBuilder sbA = q.a(strC.substring(0, annotationItem.indentLevel * 2));
                sbA.append(annotationItem.annotation);
                twoColumnOutput.write("", sbA.toString());
            }
            AnnotationItem annotationItem2 = annotationEndpoint.rangeAnnotation;
            if (annotationItem2 != null) {
                StringBuilder sbA2 = q.a(strC.substring(0, annotationItem2.indentLevel * 2));
                sbA2.append(annotationItem2.annotation);
                string = sbA2.toString();
            }
            int i14 = iIntValue + i10;
            twoColumnOutput.write(Hex.dump(bArr, i14, iIntValue2 - iIntValue, i14, this.hexCols, 6), string);
            i12 = i13;
        }
        int iIntValue3 = numArr[numArr.length - 1].intValue();
        if (iIntValue3 < bArr.length) {
            int i15 = iIntValue3 + i10;
            twoColumnOutput.write(Hex.dump(bArr, i15, (bArr.length - i10) - iIntValue3, i15, this.hexCols, 6), "");
        }
    }

    private String formatAnnotation(int i10, Integer num, String str) {
        if (num != null) {
            return String.format("[0x%x, 0x%x) \"%s\"", Integer.valueOf(i10), num, str);
        }
        return String.format("[0x%x, ) \"%s\"", Integer.valueOf(i10), str);
    }
}
