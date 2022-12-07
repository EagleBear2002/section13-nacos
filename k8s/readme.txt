部署命令：kubectl create -f k8s-deploy.yaml

部署前需要启动nacos（目前的k8s里应该已经有了，www.nacos.com/nacos）：
cd C:\software\nacos\nacos-k8s
kubectl create -f ./deploy/mysql/mysql-local.yaml
kubectl create -f ./deploy/nacos/nacos-quick-start.yaml

然后在nacos里增加以下两个data id
licensingservice.yml
organizationservice.yml

以下这些可以单独部署
k8s-deploy-db.yaml
k8s-deploy-org.yaml
k8s-deploy-license.yaml
