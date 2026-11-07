package r2;

import android.net.Uri;
import android.os.Build;
import androidx.camera.camera2.internal.s0;
import androidx.work.e;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u {
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static androidx.work.e a(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e6;
        androidx.work.e eVar = new androidx.work.e();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i6 = objectInputStream.readInt(); i6 > 0; i6--) {
                            eVar.f1771a.add(new e.a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean()));
                        }
                    } catch (IOException e7) {
                        e6 = e7;
                        e6.printStackTrace();
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                        return eVar;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e9) {
                        e9.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e10) {
                objectInputStream = null;
                e6 = e10;
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                }
                byteArrayInputStream.close();
                throw th;
            }
            try {
                objectInputStream.close();
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            try {
                byteArrayInputStream.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
        }
        return eVar;
    }

    public static androidx.work.a b(int i6) {
        if (i6 == 0) {
            return androidx.work.a.s;
        }
        if (i6 == 1) {
            return androidx.work.a.f1752t;
        }
        throw new IllegalArgumentException(s0.a(i6, "Could not convert ", " to BackoffPolicy"));
    }

    public static androidx.work.l c(int i6) {
        if (i6 == 0) {
            return androidx.work.l.s;
        }
        if (i6 == 1) {
            return androidx.work.l.f1832t;
        }
        if (i6 == 2) {
            return androidx.work.l.f1833u;
        }
        if (i6 == 3) {
            return androidx.work.l.f1834v;
        }
        if (i6 == 4) {
            return androidx.work.l.f1835w;
        }
        if (Build.VERSION.SDK_INT < 30 || i6 != 5) {
            throw new IllegalArgumentException(s0.a(i6, "Could not convert ", " to NetworkType"));
        }
        return androidx.work.l.f1836x;
    }

    public static androidx.work.o d(int i6) {
        if (i6 == 0) {
            return androidx.work.o.s;
        }
        if (i6 == 1) {
            return androidx.work.o.f1841t;
        }
        throw new IllegalArgumentException(s0.a(i6, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static androidx.work.p e(int i6) {
        if (i6 == 0) {
            return androidx.work.p.s;
        }
        if (i6 == 1) {
            return androidx.work.p.f1843t;
        }
        if (i6 == 2) {
            return androidx.work.p.f1844u;
        }
        if (i6 == 3) {
            return androidx.work.p.f1845v;
        }
        if (i6 == 4) {
            return androidx.work.p.f1846w;
        }
        if (i6 == 5) {
            return androidx.work.p.f1847x;
        }
        throw new IllegalArgumentException(s0.a(i6, "Could not convert ", " to State"));
    }

    public static int f(androidx.work.p pVar) {
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i6 = 1;
        if (iOrdinal != 1) {
            i6 = 2;
            if (iOrdinal != 2) {
                i6 = 3;
                if (iOrdinal != 3) {
                    i6 = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + pVar + " to int");
                    }
                }
            }
        }
        return i6;
    }
}
