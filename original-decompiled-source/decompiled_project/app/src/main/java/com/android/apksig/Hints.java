package com.android.apksig;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Hints {
    public static final String PIN_BYTE_RANGE_ZIP_ENTRY_NAME = "pinlist.meta";
    public static final String PIN_HINT_ASSET_ZIP_ENTRY_NAME = "assets/com.android.hints.pins.txt";

    public static final class ByteRange {
        final long end;
        final long start;

        public ByteRange(long j10, long j11) {
            this.start = j10;
            this.end = j11;
        }
    }

    private static int clampToInt(long j10) {
        return (int) Math.max(0L, Math.min(j10, 2147483647L));
    }

    public static byte[] encodeByteRangeList(List<ByteRange> list) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(list.size() * 8);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        try {
            for (ByteRange byteRange : list) {
                dataOutputStream.writeInt(clampToInt(byteRange.start));
                dataOutputStream.writeInt(clampToInt(byteRange.end - byteRange.start));
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new AssertionError("impossible", e10);
        }
    }

    public static ArrayList<PatternWithRange> parsePinPatterns(byte[] bArr) throws NumberFormatException {
        ArrayList<PatternWithRange> arrayList = new ArrayList<>();
        try {
            for (String str : new String(bArr, "UTF-8").split("\n")) {
                String strReplaceFirst = str.replaceFirst("#.*", "");
                String[] strArrSplit = strReplaceFirst.split(" ");
                if (strArrSplit.length == 1) {
                    arrayList.add(new PatternWithRange(strArrSplit[0]));
                } else {
                    if (strArrSplit.length != 3) {
                        throw new AssertionError("bad pin pattern line " + strReplaceFirst);
                    }
                    long j10 = Long.parseLong(strArrSplit[1]);
                    arrayList.add(new PatternWithRange(strArrSplit[0], j10, Long.parseLong(strArrSplit[2]) - j10));
                }
            }
            return arrayList;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 must be supported", e10);
        }
    }

    public static final class PatternWithRange {
        final long offset;
        final Pattern pattern;
        final long size;

        public PatternWithRange(String str) {
            this.pattern = Pattern.compile(str);
            this.offset = 0L;
            this.size = Long.MAX_VALUE;
        }

        public ByteRange ClampToAbsoluteByteRange(ByteRange byteRange) {
            long j10 = byteRange.end;
            long j11 = byteRange.start;
            long j12 = j10 - j11;
            long j13 = this.offset;
            if (j12 < j13) {
                return null;
            }
            long j14 = j11 + j13;
            return new ByteRange(j14, Math.min(j10 - j14, this.size) + j14);
        }

        public Matcher matcher(CharSequence charSequence) {
            return this.pattern.matcher(charSequence);
        }

        public PatternWithRange(String str, long j10, long j11) {
            this.pattern = Pattern.compile(str);
            this.offset = j10;
            this.size = j11;
        }
    }
}
