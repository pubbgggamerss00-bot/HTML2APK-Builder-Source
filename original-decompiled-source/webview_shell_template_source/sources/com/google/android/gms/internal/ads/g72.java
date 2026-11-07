package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g72 extends wj1 {

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f4925e;

    /* renamed from: f, reason: collision with root package name */
    public final DatagramPacket f4926f;

    /* renamed from: g, reason: collision with root package name */
    public Uri f4927g;
    public DatagramSocket h;

    /* renamed from: i, reason: collision with root package name */
    public MulticastSocket f4928i;

    /* renamed from: j, reason: collision with root package name */
    public InetAddress f4929j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4930k;

    /* renamed from: l, reason: collision with root package name */
    public int f4931l;

    public g72() {
        super(true);
        byte[] bArr = new byte[2000];
        this.f4925e = bArr;
        this.f4926f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final long c(os1 os1Var) throws IOException {
        Uri uri = os1Var.f7851a;
        this.f4927g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f4927g.getPort();
        l(os1Var);
        try {
            this.f4929j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f4929j, port);
            if (this.f4929j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f4928i = multicastSocket;
                multicastSocket.joinGroup(this.f4929j);
                this.h = this.f4928i;
            } else {
                this.h = new DatagramSocket(inetSocketAddress);
            }
            this.h.setSoTimeout(8000);
            this.f4930k = true;
            m(os1Var);
            return -1L;
        } catch (IOException e6) {
            throw new j62(2001, e6);
        } catch (SecurityException e7) {
            throw new j62(2006, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.gc2
    public final int j(int i6, int i7, byte[] bArr) throws IOException {
        if (i7 == 0) {
            return 0;
        }
        int i8 = this.f4931l;
        DatagramPacket datagramPacket = this.f4926f;
        if (i8 == 0) {
            try {
                DatagramSocket datagramSocket = this.h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f4931l = length;
                a(length);
            } catch (SocketTimeoutException e6) {
                throw new j62(2002, e6);
            } catch (IOException e7) {
                throw new j62(2001, e7);
            }
        }
        int length2 = datagramPacket.getLength();
        int i9 = this.f4931l;
        int iMin = Math.min(i9, i7);
        System.arraycopy(this.f4925e, length2 - i9, bArr, i6, iMin);
        this.f4931l -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final Uri zzc() {
        return this.f4927g;
    }

    @Override // com.google.android.gms.internal.ads.lo1
    public final void zzd() throws IOException {
        InetAddress inetAddress;
        this.f4927g = null;
        MulticastSocket multicastSocket = this.f4928i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f4929j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f4928i = null;
        }
        DatagramSocket datagramSocket = this.h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.h = null;
        }
        this.f4929j = null;
        this.f4931l = 0;
        if (this.f4930k) {
            this.f4930k = false;
            k();
        }
    }
}
