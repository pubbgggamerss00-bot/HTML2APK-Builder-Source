package lf;

import android.text.Layout;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public final class c {
    public static final int a(Layout layout, int i10, boolean z10) {
        if (i10 <= 0) {
            return 0;
        }
        if (i10 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i10);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i10 || lineEnd == i10) {
            if (lineStart == i10) {
                if (z10) {
                    return lineForOffset - 1;
                }
            } else if (!z10) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static MessageDigest b() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static MessageDigest c() {
        try {
            return MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static MessageDigest d() {
        try {
            return MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }
}
