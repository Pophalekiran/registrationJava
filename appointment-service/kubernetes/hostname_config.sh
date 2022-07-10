kubectl create configmap hostname-config --from-literal=postgres_host=$(kubectl get svc/my-release-postgresql -o jsonpath="{.spec.clusterIP}")
