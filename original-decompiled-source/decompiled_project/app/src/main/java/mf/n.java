package mf;

import com.yalantis.ucrop.view.CropImageView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class n implements jf.c {

    /* renamed from: a, reason: collision with root package name */
    public final cf.d f18220a;

    static {
        new wf.c(0.001f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.001f, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    public n() {
        cf.d dVar = new cf.d();
        this.f18220a = dVar;
        dVar.O0(cf.l.f5532w2, cf.l.G0);
        new HashMap();
    }

    @Override // jf.c
    public final cf.b Z() {
        return this.f18220a;
    }

    public abstract void a(int i10);

    public abstract byte[] b(int i10) throws IOException;

    public final byte[] c(String str) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int iCharCount = 0;
        while (iCharCount < str.length()) {
            int iCodePointAt = str.codePointAt(iCharCount);
            byteArrayOutputStream.write(b(iCodePointAt));
            iCharCount += Character.charCount(iCodePointAt);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public abstract void d() throws IOException;

    public abstract boolean e();

    public final boolean equals(Object obj) {
        return (obj instanceof n) && ((n) obj).f18220a == this.f18220a;
    }

    public final int hashCode() {
        return this.f18220a.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + " " + ((p) this).f18220a.J0(cf.l.f5529w);
    }
}
