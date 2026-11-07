package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class me {
    public final /* synthetic */ int s;

    public /* synthetic */ me(int i6) {
        this.s = i6;
    }

    public static HashMap d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d("me", "decode object failure");
            return null;
        }
    }

    public static me g(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new p92(cls.getSimpleName()) : new q92(cls.getSimpleName());
    }

    public static int o(int i6, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i7 <= i6) {
            return i6;
        }
        int i8 = i6 + (i6 >> 1) + 1;
        if (i8 < i7) {
            int iHighestOneBit = Integer.highestOneBit(i7 - 1);
            i8 = iHighestOneBit + iHighestOneBit;
        }
        if (i8 < 0) {
            return Integer.MAX_VALUE;
        }
        return i8;
    }

    public abstract int a(kr1 kr1Var);

    public abstract Class b();

    public abstract Object c();

    public abstract void e(int i6, int i7, byte[] bArr);

    public abstract void f(String str);

    public abstract me h(Object obj);

    public abstract nk0 i();

    public abstract Object j(ih1 ih1Var, Class cls);

    public abstract HashMap k();

    public abstract void l(kr1 kr1Var, Set set);

    public abstract yk0 m();

    public abstract Object n(eu euVar);

    public abstract pn0 p();

    public String toString() throws IOException {
        switch (this.s) {
            case 0:
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(k());
                    objectOutputStream.close();
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                } catch (IOException unused) {
                    return null;
                }
            case 6:
                return c().toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ me(boolean z6) {
        this.s = 5;
    }
}
