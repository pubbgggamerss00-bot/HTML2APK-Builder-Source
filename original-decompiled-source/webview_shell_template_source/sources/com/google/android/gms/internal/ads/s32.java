package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.s32;
import com.google.android.gms.internal.ads.t32;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class s32<MessageType extends t32<MessageType, BuilderType>, BuilderType extends s32<MessageType, BuilderType>> implements l62 {
    public static void f(int i6, List list) {
        String strA = androidx.camera.camera2.internal.s0.a(list.size() - i6, "Element at index ", " is null.");
        int size = list.size();
        while (true) {
            size--;
            if (size < i6) {
                throw new NullPointerException(strA);
            }
            list.remove(size);
        }
    }

    public final void e(byte[] bArr, u42 u42Var) throws u52 {
        int length = bArr.length;
        e52 e52Var = (e52) this;
        e52Var.i();
        try {
            u62.f9474c.a(e52Var.f4126t.getClass()).f(e52Var.f4126t, bArr, 0, length, new x32(u42Var));
        } catch (u52 e6) {
            throw e6;
        } catch (IOException e7) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e7);
        } catch (IndexOutOfBoundsException unused) {
            throw new u52("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
