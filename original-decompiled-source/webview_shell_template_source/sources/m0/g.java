package m0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import l0.e;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g extends k {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f13869a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor<?> f13870b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f13871c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f13872d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            method = null;
            method2 = null;
        }
        f13870b = constructor;
        f13869a = cls;
        f13871c = method2;
        f13872d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i6, int i7, boolean z6) {
        try {
            return ((Boolean) f13871c.invoke(obj, byteBuffer, Integer.valueOf(i6), null, Integer.valueOf(i7), Boolean.valueOf(z6))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface h(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(f13869a, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f13872d.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // m0.k
    public final Typeface a(Context context, e.b bVar, Resources resources, int i6) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f13870b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (e.c cVar : bVar.f13783a) {
                int i7 = cVar.f13789f;
                File fileD = l.d(context);
                if (fileD != null) {
                    try {
                        if (l.b(fileD, resources, i7)) {
                            try {
                                fileInputStream = new FileInputStream(fileD);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && g(objNewInstance, map, cVar.f13788e, cVar.f13785b, cVar.f13786c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileD.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return h(objNewInstance);
        }
        return null;
    }

    @Override // m0.k
    public final Typeface b(Context context, r0.l[] lVarArr, int i6) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = f13870b.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            w.g gVar = new w.g();
            int length = lVarArr.length;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    r0.l lVar = lVarArr[i7];
                    Uri uri = lVar.f14248a;
                    ByteBuffer byteBufferE = (ByteBuffer) gVar.get(uri);
                    if (byteBufferE == null) {
                        byteBufferE = l.e(context, uri);
                        gVar.put(uri, byteBufferE);
                    }
                    if (byteBufferE == null || !g(objNewInstance, byteBufferE, lVar.f14249b, lVar.f14250c, lVar.f14251d)) {
                        break;
                    }
                    i7++;
                } else {
                    Typeface typefaceH = h(objNewInstance);
                    if (typefaceH != null) {
                        return Typeface.create(typefaceH, i6);
                    }
                }
            }
        }
        return null;
    }
}
