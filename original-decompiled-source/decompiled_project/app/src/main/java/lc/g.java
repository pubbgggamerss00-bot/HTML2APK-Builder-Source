package lc;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16944a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f16945b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(byte[] bArr) {
        this.f16945b = bArr;
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f16945b);
                    Object next2 = it.next();
                    next2.getClass();
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public String b(Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public String toString() {
        switch (this.f16944a) {
            case 1:
                StringBuilder sb = new StringBuilder("{ FamilyKind = ");
                byte[] bArr = (byte[]) this.f16945b;
                sb.append((int) bArr[0]);
                sb.append(", SerifStyle = ");
                sb.append((int) bArr[1]);
                sb.append(", Weight = ");
                sb.append((int) bArr[2]);
                sb.append(", Proportion = ");
                sb.append((int) bArr[3]);
                sb.append(", Contrast = ");
                sb.append((int) bArr[4]);
                sb.append(", StrokeVariation = ");
                sb.append((int) bArr[5]);
                sb.append(", ArmStyle = ");
                sb.append((int) bArr[6]);
                sb.append(", Letterform = ");
                sb.append((int) bArr[7]);
                sb.append(", Midline = ");
                sb.append((int) bArr[8]);
                sb.append(", XHeight = ");
                return x0.a.a(sb, bArr[9], "}");
            default:
                return super.toString();
        }
    }

    public g(String str) {
        str.getClass();
        this.f16945b = str;
    }
}
