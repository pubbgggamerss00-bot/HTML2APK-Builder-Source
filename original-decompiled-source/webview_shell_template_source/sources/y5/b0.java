package y5;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class b0 {
    public static void a(Throwable th, Throwable th2) {
        kotlin.jvm.internal.j.e("<this>", th);
        kotlin.jvm.internal.j.e("exception", th2);
        if (th != th2) {
            j5.b.f13504a.a(th, th2);
        }
    }

    public static int c(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static Drawable d(Context context, int i6) {
        return l.s0.b().c(context, i6);
    }

    public static final String e(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final void f(g5.f fVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = b6.e.f2018a.iterator();
        while (it.hasNext()) {
            try {
                ((v) it.next()).j(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            a(th, new b6.f(fVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static e1.b g(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j6;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i6 = byteBufferDuplicate.getShort() & 65535;
        if (i6 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                j6 = -1;
                break;
            }
            int i8 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j6 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i8) {
                break;
            }
            i7++;
        }
        if (j6 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j6 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j7 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i9 = 0; i9 < j7; i9++) {
                int i10 = byteBufferDuplicate.getInt();
                long j8 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i10 || 1701669481 == i10) {
                    byteBufferDuplicate.position((int) (j8 + j6));
                    e1.b bVar = new e1.b(0);
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f12778d = byteBufferDuplicate;
                    bVar.f12775a = iPosition;
                    int i11 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f12776b = i11;
                    bVar.f12777c = ((ByteBuffer) bVar.f12778d).getShort(i11);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final String h(g5.d dVar) {
        Object objA;
        if (dVar instanceof b6.g) {
            return dVar.toString();
        }
        try {
            objA = dVar + '@' + e(dVar);
        } catch (Throwable th) {
            objA = d5.e.a(th);
        }
        if (d5.d.a(objA) != null) {
            objA = dVar.getClass().getName() + '@' + e(dVar);
        }
        return (String) objA;
    }

    public Activity b() {
        throw null;
    }
}
