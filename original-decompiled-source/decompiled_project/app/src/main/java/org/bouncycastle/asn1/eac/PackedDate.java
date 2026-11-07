package org.bouncycastle.asn1.eac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import org.bouncycastle.util.Arrays;

/* loaded from: classes2.dex */
public class PackedDate {
    private byte[] time;

    public PackedDate(String str) {
        this.time = convert(str);
    }

    private byte[] convert(String str) {
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[6];
        for (int i10 = 0; i10 != 6; i10++) {
            bArr[i10] = (byte) (charArray[i10] - '0');
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof PackedDate) {
            return Arrays.areEqual(this.time, ((PackedDate) obj).time);
        }
        return false;
    }

    public Date getDate() throws ParseException {
        return new SimpleDateFormat("yyyyMMdd").parse("20" + toString());
    }

    public byte[] getEncoding() {
        return Arrays.clone(this.time);
    }

    public int hashCode() {
        return Arrays.hashCode(this.time);
    }

    public String toString() {
        int length = this.time.length;
        char[] cArr = new char[length];
        for (int i10 = 0; i10 != length; i10++) {
            cArr[i10] = (char) ((this.time[i10] & 255) + 48);
        }
        return new String(cArr);
    }

    public PackedDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd'Z'");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = convert(simpleDateFormat.format(date));
    }

    public PackedDate(Date date, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMdd'Z'", locale);
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        this.time = convert(simpleDateFormat.format(date));
    }

    public PackedDate(byte[] bArr) {
        this.time = bArr;
    }
}
