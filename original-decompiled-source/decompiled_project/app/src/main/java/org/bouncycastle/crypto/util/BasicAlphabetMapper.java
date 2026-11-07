package org.bouncycastle.crypto.util;

import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AlphabetMapper;

/* loaded from: classes2.dex */
public class BasicAlphabetMapper implements AlphabetMapper {
    private Map<Integer, Character> charMap;
    private Map<Character, Integer> indexMap;

    public BasicAlphabetMapper(String str) {
        this(str.toCharArray());
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public char[] convertToChars(byte[] bArr) {
        int i10 = 0;
        if (this.charMap.size() <= 256) {
            char[] cArr = new char[bArr.length];
            while (i10 != bArr.length) {
                cArr[i10] = this.charMap.get(Integer.valueOf(bArr[i10] & 255)).charValue();
                i10++;
            }
            return cArr;
        }
        if ((bArr.length & 1) != 0) {
            throw new IllegalArgumentException("two byte radix and input string odd length");
        }
        char[] cArr2 = new char[bArr.length / 2];
        while (i10 != bArr.length) {
            cArr2[i10 / 2] = this.charMap.get(Integer.valueOf(((bArr[i10] << 8) & 65280) | (bArr[i10 + 1] & 255))).charValue();
            i10 += 2;
        }
        return cArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public byte[] convertToIndexes(char[] cArr) {
        int i10 = 0;
        if (this.indexMap.size() <= 256) {
            byte[] bArr = new byte[cArr.length];
            while (i10 != cArr.length) {
                bArr[i10] = this.indexMap.get(Character.valueOf(cArr[i10])).byteValue();
                i10++;
            }
            return bArr;
        }
        byte[] bArr2 = new byte[cArr.length * 2];
        while (i10 != cArr.length) {
            int iIntValue = this.indexMap.get(Character.valueOf(cArr[i10])).intValue();
            int i11 = i10 * 2;
            bArr2[i11] = (byte) ((iIntValue >> 8) & 255);
            bArr2[i11 + 1] = (byte) (iIntValue & 255);
            i10++;
        }
        return bArr2;
    }

    @Override // org.bouncycastle.crypto.AlphabetMapper
    public int getRadix() {
        return this.indexMap.size();
    }

    public BasicAlphabetMapper(char[] cArr) {
        this.indexMap = new HashMap();
        this.charMap = new HashMap();
        for (int i10 = 0; i10 != cArr.length; i10++) {
            if (this.indexMap.containsKey(Character.valueOf(cArr[i10]))) {
                throw new IllegalArgumentException("duplicate key detected in alphabet: " + cArr[i10]);
            }
            this.indexMap.put(Character.valueOf(cArr[i10]), Integer.valueOf(i10));
            this.charMap.put(Integer.valueOf(i10), Character.valueOf(cArr[i10]));
        }
    }
}
