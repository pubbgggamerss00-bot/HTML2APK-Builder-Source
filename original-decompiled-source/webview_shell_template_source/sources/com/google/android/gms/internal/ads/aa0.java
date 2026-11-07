package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class aa0 extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    public final SSLSocketFactory f2640a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ba0 f2641b;

    public aa0(ba0 ba0Var) {
        this.f2641b = ba0Var;
    }

    public final void a(Socket socket) throws SocketException {
        ba0 ba0Var = this.f2641b;
        int i6 = ba0Var.f3017r;
        if (i6 > 0) {
            socket.setReceiveBufferSize(i6);
        }
        ba0Var.s.add(socket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i6) throws IOException {
        Socket socketCreateSocket = this.f2640a.createSocket(str, i6);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f2640a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f2640a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i6, InetAddress inetAddress, int i7) throws IOException {
        Socket socketCreateSocket = this.f2640a.createSocket(str, i6, inetAddress, i7);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i6) throws IOException {
        Socket socketCreateSocket = this.f2640a.createSocket(inetAddress, i6);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i6, InetAddress inetAddress2, int i7) throws IOException {
        Socket socketCreateSocket = this.f2640a.createSocket(inetAddress, i6, inetAddress2, i7);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i6, boolean z6) throws IOException {
        Socket socketCreateSocket = this.f2640a.createSocket(socket, str, i6, z6);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
