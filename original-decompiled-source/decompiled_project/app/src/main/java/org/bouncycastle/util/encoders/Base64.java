package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import k4.i;
import org.bouncycastle.util.Strings;

/* loaded from: classes3.dex */
public class Base64 {
    private static final Encoder encoder = new Base64Encoder();

    public static int decode(String str, OutputStream outputStream) throws IOException {
        return encoder.decode(str, outputStream);
    }

    public static int encode(byte[] bArr, int i10, int i11, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, i10, i11, outputStream);
    }

    public static String toBase64String(byte[] bArr) {
        return toBase64String(bArr, 0, bArr.length);
    }

    public static int decode(byte[] bArr, int i10, int i11, OutputStream outputStream) {
        try {
            return encoder.decode(bArr, i10, i11, outputStream);
        } catch (Exception e10) {
            throw new DecoderException(i.a(e10, new StringBuilder("unable to decode base64 data: ")), e10);
        }
    }

    public static int encode(byte[] bArr, OutputStream outputStream) throws IOException {
        return encoder.encode(bArr, 0, bArr.length, outputStream);
    }

    public static String toBase64String(byte[] bArr, int i10, int i11) {
        return Strings.fromByteArray(encode(bArr, i10, i11));
    }

    public static byte[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    public static byte[] encode(byte[] bArr, int i10, int i11) {
        Encoder encoder2 = encoder;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(encoder2.getEncodedLength(i11));
        try {
            encoder2.encode(bArr, i10, i11, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new EncoderException(i.a(e10, new StringBuilder("exception encoding base64 string: ")), e10);
        }
    }

    public static byte[] decode(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            encoder.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(i.a(e10, new StringBuilder("unable to decode base64 string: ")), e10);
        }
    }

    public static byte[] decode(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            encoder.decode(bArr, 0, bArr.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e10) {
            throw new DecoderException(i.a(e10, new StringBuilder("unable to decode base64 data: ")), e10);
        }
    }
}
