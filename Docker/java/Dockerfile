FROM eclipse-temurin:21-jdk

RUN apt-get update && apt-get install -y --no-install-recommends \
      openssh-server curl wget tar git procps ca-certificates \
    && mkdir -p /run/sshd \
    && useradd -m -s /bin/bash dev \
    && rm -rf /var/lib/apt/lists/*

COPY id_ed25519.pub /home/dev/.ssh/authorized_keys
RUN chown -R dev:dev /home/dev/.ssh \
    && chmod 700 /home/dev/.ssh && chmod 600 /home/dev/.ssh/authorized_keys \
    && sed -i 's/^#\?PasswordAuthentication.*/PasswordAuthentication no/' /etc/ssh/sshd_config

EXPOSE 22
CMD ["/usr/sbin/sshd", "-D"]
